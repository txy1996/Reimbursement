package com.zlt.system.servlet;

/**
 * @author 刘俊泽
 * 申请报销审批
 */
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.zlt.system.dao.impl.HotelDaoImpl;
import com.zlt.system.entity.Status;
import com.zlt.system.service.ApplyreimService;
import com.zlt.system.service.impl.ApplyreimServiceImpl;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.HotelInfoVo;
import com.zlt.system.vo.OtherInfoVo;
import com.zlt.system.vo.TrafficInfoVo;
import com.zlt.system.vo.TravelInfoVo;

/**
 * Servlet implementation class ApplyreimServlet
 */
@WebServlet("/ApplyreimServlet")
public class ApplyreimServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ApplyreimService app = new ApplyreimServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyreimServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type = request.getParameter("type");
		if("findall".equals(type)){
			Reimbursement(request,response);
		}else if("findbyid".equals(type)){
			inquire(request,response);
		}else if("findByName".equals(type)){
			AppByName(request, response);
		}else if("findBytype".equals(type)){
			AppBytype(request,response);
		}else if("findtype".equals(type)){
			FindByType(request,response);
		}else if("agree".equals(type)){
			Agree(request, response);
		}else if("refuse".equals(type)){
			Refuse(request, response);
		}
				
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 
	}
	/**
	 * @author 刘俊泽查看全部
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void Reimbursement(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		ApplyreimServiceImpl app = new ApplyreimServiceImpl();
		java.util.List<ApplyreimVo> a = app.Reimbursement();
		request.setAttribute("list", a);
		request.getRequestDispatcher("demo/expenseclaim.jsp").forward(request, response);
	}
	/**
	 * @author 刘俊泽 根据ID查询
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void inquire(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	/*	System.out.println("进来了");*/
		String id=request.getParameter("app_abb");
		String emp_name=request.getParameter("emp_name");
		String reim_type=request.getParameter("reim_type");
		
		java.util.List<ApplyreimVo> b = app.FindById(id,emp_name,reim_type);
		request.setAttribute("list",b);
		request.getRequestDispatcher("demo/expenseclaim.jsp").forward(request, response);
		
		
		
	}
	public void FindByType(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String id=request.getParameter("app_abb");
		session.setAttribute("dd", id);
		ApplyreimVo apply=app.FindByName(id);
		System.out.println(apply);
		String type=apply.getReim_type();
		System.out.println(type);
		if("差旅报销".equals(type)) {
			TravelInfoVo travel=app.ReimbursementTravel(id);
			request.setAttribute("TravelInfoVo", travel);
			
			request.getRequestDispatcher("demo/travel.jsp").forward(request, response);
		}else if("交通报销".equals(type)) {
			TrafficInfoVo traffic=app.ReimbursementTraffic(id);
			request.setAttribute("TrafficInfoVo", traffic);
			request.getRequestDispatcher("demo/affic.jsp").forward(request, response);
		}else if("住宿报销".equals(type)) {
			HotelInfoVo hotel=app.ReimbursementHotel(id);
			request.setAttribute("HotelInfoVo", hotel);
			request.getRequestDispatcher("demo/putup.jsp").forward(request, response);
		}else if("其他".equals(type)) {
			OtherInfoVo other=app.ReimbursementOther(id);
			request.setAttribute("OtherInfoVo", other);
			request.getRequestDispatcher("demo/esles.jsp").forward(request, response);
		}
	}	
	private void AppByName(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String name = request.getParameter("emp_name");
		java.util.List<ApplyreimVo> c = (java.util.List<ApplyreimVo>) app.FindByName(name);
		request.setAttribute("list", c);
		request.getRequestDispatcher("demo/expenseclaim.jsp").forward(request, response);
	}
	private void AppBytype(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String type = request.getParameter("reim_type");
		HotelDaoImpl ty = new HotelDaoImpl();
		java.util.List<ApplyreimVo> t = (java.util.List<ApplyreimVo>) ty.FindBytype(type);
		request.setAttribute("list", t);
		request.getRequestDispatcher("demo/expenseclaim.jsp").forward(request, response);
	}
	private void Agree(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session=request.getSession();
		String c = (String) session.getAttribute("dd");
		String a = request.getParameter("ll");
		Status ll = new Status();
		Date time = new Date();
		ll.setStatus1_time(time);
		ll.setApp_abb(c);
		ll.setStatus1_opinion(a);
		app.UpdateState(ll);
		Reimbursement(request, response);
	}
	private void Refuse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session=request.getSession();
		String a = request.getParameter("ll");
		String c = (String) session.getAttribute("dd");
		Status ll = new Status();
		Date time = new Date();
		ll.setStatus1_time(time);
		ll.setApp_abb(c);
		ll.setStatus1_opinion(a);
		app.InsertReson(ll);
		Reimbursement(request, response);
	}
}
