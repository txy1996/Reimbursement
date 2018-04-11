package com.zlt.system.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zlt.system.entity.Department;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.service.ReportFormService;
import com.zlt.system.service.impl.ReportFormServiceImpl;
import com.zlt.system.vo.CompanyInfoVo;
import com.zlt.system.vo.DepartNameVo;
import com.zlt.system.vo.DepartmentInfoVo;
import com.zlt.system.vo.GetTimeVo;

/**
 * Servlet implementation class ReportFormServlet
 */
@WebServlet("/ReportFormServlet")
public class ReportFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReportFormService report = new ReportFormServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if("findtime".equals(type)){
			findTime(request, response);
		}else if("depart_bar".equals(type)){
			setDepartmentBar(request, response);
		}else if("depart_line".equals(type)){
			setDepartmentLine(request, response);
		}else if("depart_pie".equals(type)){
			setDepartmentPie(request, response);
		}else if("company_bar".equals(type)){
			setCompanyBar(request, response);
		}else if("company_line".equals(type)){
			setCompanyLine(request, response);
		}else if("company_pie".equals(type)){
			setCompanyPie(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	/**
	 * 添加柱状图所需数据
	 * @2018年1月26日
	 * @void
	 * @setDepartmentBar
	 * @author 米邓勇
	 */
	public void setDepartmentBar(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		ReportFormService rs = new ReportFormServiceImpl();
		List<ReimTypeTab> list = rs.findReimTypeTabAll();
		String[] str = new String[list.size()];
		int s=0;
		for(ReimTypeTab d:list){
			str[s] = d.getReim_type();
			s++;
		}
		String year = request.getParameter("year");
		System.out.println(year+"sss");
		String user = (String) request.getSession().getAttribute("username");
		DepartNameVo depart = rs.findDepart(user);
		System.out.println(depart.getDepart());
		List<DepartmentInfoVo> list1 = rs.findDepartmentInfo(Integer.parseInt(year),depart.getDepart());
		for(DepartmentInfoVo de:list1){
			System.out.println(de);
		}
		int[] inte = new int[list1.size()];
		int i = 0;
		for(DepartmentInfoVo d:list1){
			inte[i] = d.getNum();
			i++;
		}
		JSONObject json = new JSONObject();
		json.put("names", str);
		json.put("leg", "销量");
		json.put("nums", inte);
		try {
			PrintWriter out = response.getWriter();
			out.print(json.toJSONString());
			System.out.println(json.toJSONString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 添加线状图所需数据
	 * @2018年1月26日
	 * @void
	 * @setDepartmentBar
	 * @author 米邓勇
	 */
	public void setDepartmentLine(HttpServletRequest request, HttpServletResponse response){
		
	}
	/**
	 * 添加饼状图所需数据
	 * @2018年1月26日
	 * @void
	 * @setDepartmentBar
	 * @author 米邓勇
	 */
	public void setDepartmentPie(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		ReportFormService rs = new ReportFormServiceImpl();
		List<ReimTypeTab> list = rs.findReimTypeTabAll();
		String[] str = new String[list.size()];
		int s=0;
		for(ReimTypeTab d:list){
			str[s] = d.getReim_type();
			s++;
		}
		String year = request.getParameter("year");
		System.out.println(year+"sss");
		String user = (String) request.getSession().getAttribute("username");
		DepartNameVo depart = rs.findDepart(user);
		System.out.println(depart.getDepart());
		List<DepartmentInfoVo> list1 = rs.findDepartmentInfo(Integer.parseInt(year),depart.getDepart());
		int[] inte = new int[list1.size()];
		int i = 0;
		for(DepartmentInfoVo d:list1){
			inte[i] = d.getNum();
			i++;
		}
		
		JSONArray arr = new JSONArray();
		for(int m=0;m<i;m++){
			JSONObject ob = new JSONObject();
			ob.put("name", str[m]);
			ob.put("value", inte[m]);
			arr.add(ob);
		}
		JSONObject json = new JSONObject();
		json.put("data", arr);
		
		try {
			PrintWriter out = response.getWriter();
			out.print(json.toJSONString());
			System.out.println(json.toJSONString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 添加柱状图所需数据
	 * @2018年1月26日
	 * @void
	 * @setDepartmentBar
	 * @author 米邓勇
	 */
	public void setCompanyBar(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		ReportFormService rs = new ReportFormServiceImpl();
		/**
		 * 获取所有的报销类型
		 */
		List<ReimTypeTab> list = rs.findReimTypeTabAll();
		String[] str = new String[list.size()];
		int s=0;
		for(ReimTypeTab d:list){
			str[s] = d.getReim_type();
			System.out.println(str[s]);
			s++;
		}
		/**
		 * 获取所有的部门名称
		 */
		List<Department> depart = rs.findDepartmentAll();
		String[] dep = new String[depart.size()];
		s = 0;
		for(Department d:depart){
			dep[s] = d.getDepartment_name();
			s++;
		}
		String year = request.getParameter("year");
		System.out.println(year+"sss");
		List<CompanyInfoVo> list1 = rs.findCompanyInfo(Integer.parseInt(year));
		int[][] value = new int[str.length][dep.length];
		//s = 0;
		//int i=0;
		for(int i=0;i<str.length;i++){
			int m =0;
			for(CompanyInfoVo c:list1){
				System.out.println(c);
				if(str[i].equals(c.getType())){
					value[i][m] = c.getNum();
					m++;
				}
			}
			
		}
		
		JSONObject json = new JSONObject();
		json.put("department", dep);
		json.put("travel", value[0]);
		json.put("traffic", value[1]);
		json.put("hotel", value[2]);
		json.put("other", value[3]);
		PrintWriter out;
		try {
			out = response.getWriter();
			out.print(json.toJSONString());
			System.out.println(json.toJSONString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	/**
	 * 添加线状图所需数据
	 * @2018年1月26日
	 * @void
	 * @setDepartmentBar
	 * @author 米邓勇
	 */
	public void setCompanyLine(HttpServletRequest request, HttpServletResponse response){
		
	}
	/**
	 * 添加饼状图所需数据
	 * @2018年1月26日
	 * @void
	 * @setDepartmentBar
	 * @author 米邓勇
	 */
	public void setCompanyPie(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		ReportFormService rs = new ReportFormServiceImpl();
		
		/**
		 * 获取所有的部门名称
		 */
		List<Department> depart = rs.findDepartmentAll();
		String[] dep = new String[depart.size()];
		int s = 0;
		for(Department d:depart){
			dep[s] = d.getDepartment_name();
			s++;
		}
		String year = request.getParameter("year");
		System.out.println(year);
		int[] num = new int[dep.length];
		List<CompanyInfoVo> list1 = rs.findCompanyInfo(Integer.parseInt(year));
		for(CompanyInfoVo c:list1){
			System.out.println(c);
			for(int i=0;i<dep.length;i++){
				if(dep[i].equals(c.getDepartment())){
					System.out.println(dep[i]+"~~"+c.getDepartment());
					System.out.println(num[i]+"~~"+c.getNum());
					num[i] = num[i]+c.getNum();
				}
			}	
		}
		JSONArray arr = new JSONArray();
		for(int i=0;i<dep.length;i++){
			JSONObject ob = new JSONObject();
			ob.put("name", dep[i]);
			ob.put("value", num[i]);
			arr.add(ob);
		}
		
		JSONObject json = new JSONObject();
		json.put("pie", arr);
		PrintWriter out;
		try {
			out = response.getWriter();
			out.print(json.toJSONString());
			System.out.println(json.toJSONString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 用来获取拥有数据的所有年份
	 * @2018年1月26日
	 * @void
	 * @findTime
	 * @author 米邓勇
	 */
	public void findTime(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		List<GetTimeVo> list = report.findTime();
		JSONArray arr = new JSONArray();
		for(GetTimeVo time:list){
//			JSONObject json = new JSONObject();
//			System.out.println(time.getTime());
//			json.put("time", time.getTime());
			arr.add(time);
		}
		try {
			PrintWriter out = response.getWriter();
			out.print(arr.toJSONString());
			System.out.println(arr.toJSONString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
