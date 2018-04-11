package com.zlt.system.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zlt.system.service.impl.LoginServiceImpl;

/**
 * 登录控制类
 * Servlet implementation class LoginServlet
 * @author xinzou
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		if ("login".equals(type)) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
			int flag = loginServiceImpl.isLogin(username, password);
			switch (flag) {
			case 1:
				request.getSession(true).setAttribute("username", username);
				response.sendRedirect("index.jsp");
				break;
			case 2:
				request.getSession(true).setAttribute("username", username);
				response.sendRedirect("index2.jsp");
				break;
			case 3:
				request.getSession(true).setAttribute("username", username);
				response.sendRedirect("index3.jsp");
				break;
			default:
				response.sendRedirect("login.html");
				break;
			}
		} else if("loginout".equals(type)){
			request.getSession().removeAttribute("username");
			response.sendRedirect("login.html");
		}
		
	}

}
