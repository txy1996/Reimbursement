//package com.zlt.system.filter;
//
//import java.io.IOException;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// * Servlet Filter implementation class LoginFilter
// */
//@WebFilter(urlPatterns="/*")
//public class LoginFilter implements Filter {
//
//    /**
//     * Default constructor. 
//     */
//    public LoginFilter() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see Filter#destroy()
//	 */
//	public void destroy() {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
//	 */
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		request.setCharacterEncoding("utf-8");  
//		response.setCharacterEncoding("utf-8");  
//		//请求响应对象转换
//		HttpServletRequest req = (HttpServletRequest)request;
//		HttpServletResponse res = (HttpServletResponse)response;
//		
//		//获得当前请求的uri
//		String uri = req.getRequestURI();
//		String path = req.getContextPath();
//		String valPath = uri.substring(path.length());
//		
//		//权限验证
//		//login.html和LoginServlet可以通过
//		if ("/login.html".equals(valPath) || "/LoginServlet".equals(valPath)) {
//			chain.doFilter(request, response);
//		} else {
//			//需先登录
//			HttpSession session = req.getSession();
//			String name = (String)session.getAttribute("username");
////			String name = (String) req.getSession().getAttribute("username");
//			if (name!=null) {
//				chain.doFilter(request, response);
//			} else {
//				res.sendRedirect("login.html");
//			}
//		}
//	}
//
//	/**
//	 * @see Filter#init(FilterConfig)
//	 */
//	public void init(FilterConfig fConfig) throws ServletException {
//		// TODO Auto-generated method stub
//	}
//
//}

