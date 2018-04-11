package com.zlt.system.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zlt.system.service.HistoryRecordService;
import com.zlt.system.service.impl.HistoryRecordServiceImpl;
import com.zlt.system.vo.History;

/**
 * 历史记录查询
 * 
 * @author `'`灯半盏
 */
@WebServlet("/HistoryRecordServlet")
public class HistoryRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * 封装HistoryRecordServiceImpl对象
	 */
	private HistoryRecordService historySer = new HistoryRecordServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HistoryRecordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if ("show".equals(request.getParameter("type"))) {
			try {
				defaultShow(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if ("replace".equals(request.getParameter("type"))) {
			try {
				this.replace(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ("page".equals(request.getParameter("page"))) {

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置请求响应字符集
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		if ("findLike".equals(request.getParameter("type"))) {
			try {
				this.findLikeString(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 点击此界面时,默认使用的方法,正序排序,显示三个月内的历史记录
	 * 
	 * @param request
	 * @param response
	 * @throws SQLException
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void defaultShow(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		// 获取用户姓名并传递
		String userName = (String) request.getSession().getAttribute("username");
		List<History> list = historySer.findDefault(userName);
		request.setAttribute("list", list);
		request.getRequestDispatcher("demo/HistoryRecord.jsp").forward(request, response);
	}
	/**
	 * 根据界面的选择日期和排序方式显示内容
	 * 
	 * @param request
	 * @param response
	 * @throws SQLException
	 * @author `'`灯半盏
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void replace(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<History> list = historySer.replace();
		request.setAttribute("list", list);
		request.getRequestDispatcher("demo/HistoryRecord.jsp").forward(request, response);
	}

	/**
	 * 根据搜索框内容模糊查询内容;正序和倒序排序
	 * 
	 * @param request
	 * @param response
	 * @throws SQLException
	 * @throws IOException
	 * @throws ServletException
	 */
	protected void findLikeString(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		//接受界面输入的模糊字段
		String string = request.getParameter("value");
		//接受界面传入的时间范围
		String thismonth = request.getParameter("thismonth");
		List<History> list = historySer.findLike(string, thismonth);
		request.setAttribute("list", list);
		request.getRequestDispatcher("demo/HistoryRecord.jsp").forward(request, response);
	}
}
