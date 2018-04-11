package com.zlt.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zlt.system.service.impl.ReimnumrabServiceImpl;
import com.zlt.system.vo.MainVo;




/**
 * 显示登录人信息
 * @author fy
 *
 */
@WebServlet("/LoginInfoServlet")
public class LoginInfoServlet extends HttpServlet {
	ReimnumrabServiceImpl rsi=new ReimnumrabServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession  session = request.getSession(); 
		String emp_name=(String) session.getAttribute("username");
	    List<MainVo> list =rsi.FindByLine(emp_name);
		System.out.println(list.toString());
		request.setAttribute("list", list);
		request.getRequestDispatcher("demo/Main.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
