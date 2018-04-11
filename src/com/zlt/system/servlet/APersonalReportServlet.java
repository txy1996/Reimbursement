package com.zlt.system.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.zlt.system.entity.Employee;
import com.zlt.system.service.APersonalReportService;
import com.zlt.system.service.impl.APersonalReportServiceImpl;
import com.zlt.system.vo.Report;
import com.zlt.system.vo.Swarthy;

/**
 * Servlet implementation class APersonalReportServlet
 */
@WebServlet("/APersonalReportServlet")
/**
 * 个人报表界面
 * @author 晓煜
 * @date2018年1月25日上午9:19:00
 * @version
 * @explain
 */
public class APersonalReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public APersonalReportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type=request.getParameter("type");
		switch (type) {
		case "Timeline":
			Timeline(request, response);
			break;
		case "PieChart":
			PieChart(request, response);
			break;
		case "TimelineTwo":
			TimelineTwo(request, response);
			break;
		default:
			break;
		}

	}
	/**
	 * 饼状图的数据传递
	 * @author 晓煜
	 * @param request 获得当前登录人的姓名
	 * @param response 请求
	 * @throws ServletException
	 * @throws IOException
	 */
	public void PieChart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session=request.getSession();
		String flag=null;
		String  emp_name=(String) session.getAttribute("username");
		Employee employee=new Employee(emp_name);
		APersonalReportService service=new APersonalReportServiceImpl();
		ArrayList<Report> reports=(ArrayList<Report>) service.APersonalReportServicePie(employee);
		JSONArray jsonArray=new JSONArray();
		for (Report report:reports) {
			jsonArray.add(report);
		}
		flag=JSON.toJSONString(jsonArray);
		response.getWriter().write(jsonArray.toString());
		System.out.println(flag);
	}
	/**
	 * 年表数据
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void Timeline(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session=request.getSession();
		String flag=null;
		String  emp_name=(String) session.getAttribute("username");
		Employee employee=new Employee(emp_name);
		APersonalReportService service=new APersonalReportServiceImpl();
		ArrayList<Swarthy>swarthies=(ArrayList<Swarthy>) service.APersonalReportServiceCombination(employee);
		JSONArray jsonArray=new JSONArray();
		for (Swarthy swarthy:swarthies) {
			jsonArray.add(swarthy);
		}
		flag=JSON.toJSONString(jsonArray);
		response.getWriter().write(jsonArray.toString());
		System.out.println(flag);
	}
	
	public void TimelineTwo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session=request.getSession();
		String flag=null;
		String  emp_name=(String) session.getAttribute("username");
		Employee employee=new Employee(emp_name);
		APersonalReportService service=new APersonalReportServiceImpl();
		ArrayList<Swarthy>swarthies=(ArrayList<Swarthy>) service.APersonalReportServiceCombinationTwo(employee);
		JSONArray jsonArray=new JSONArray();
		for (Swarthy swarthy:swarthies) {
			jsonArray.add(swarthy);
		}
		flag=JSON.toJSONString(jsonArray);
		response.getWriter().write(jsonArray.toString());
		System.out.println(flag);
	}
}
