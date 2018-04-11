package com.zlt.system.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zlt.system.service.impl.ApprovalStatusServiceImpl;
import com.zlt.system.vo.StatusDetailVO;
import com.zlt.system.vo.StatusVO;

/**
 * 负责申请状态查看控制
 * Servlet implementation class StatusServlet
 * @author xinzou
 */
@WebServlet("/StatusServlet")
public class StatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String type = request.getParameter("type");
		ApprovalStatusServiceImpl approvalStatusServiceImpl = new  ApprovalStatusServiceImpl();
		List<StatusVO> statusList = null;
		if ("selectAll".equals(type)) {
			//查询所有状态信息
			statusList = approvalStatusServiceImpl.selectAll();
			request.setAttribute("statusList", statusList);
			request.getRequestDispatcher("demo/status.jsp").forward(request, response);
		} else if ("selectLike".equals(type)) {
			//模糊查询
			String likeString = request.getParameter("likeString");
			statusList = approvalStatusServiceImpl.selectLike(likeString);
			request.setAttribute("statusList", statusList);
			request.getRequestDispatcher("demo/status.jsp").forward(request, response);
		}else if ("selectDetails".equals(type)) {
			String app_abb = request.getParameter("app_abb");
			StatusDetailVO statusDetailVO = approvalStatusServiceImpl.selectDetails(app_abb);
			request.setAttribute("statusDetailVO", statusDetailVO);
			if (app_abb.contains("ZS")) {
				request.getRequestDispatcher("demo/hotelDetails.jsp").forward(request, response);
			} else if (app_abb.contains("CL")) {
				request.getRequestDispatcher("demo/travelDetails.jsp").forward(request, response);
			} else if (app_abb.contains("JT")) {
				request.getRequestDispatcher("demo/trafficDetails.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("demo/otherDetails.jsp").forward(request, response);
			}
			
		}
		
	}

}
