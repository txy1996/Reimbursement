package com.zlt.system.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zlt.system.entity.Finance;
import com.zlt.system.entity.ReimTypeTab;
import com.zlt.system.service.impl.FinanceServiceImpl;
import com.zlt.system.service.impl.ReimnumrabServiceImpl;
import com.zlt.system.util.DataUtil;


/**
 * Servlet implementation class FinanceServlet
 */
@WebServlet("/FinanceServlet")
public class FinanceServlet extends HttpServlet {
	FinanceServiceImpl fsl=new FinanceServiceImpl();
	ReimnumrabServiceImpl rsl=new ReimnumrabServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String type=request.getParameter("type");
		if("findall".equals(type)){
			System.out.println(type);
			FindAll(request, response);
		}else if("delete".equals(type)){
			delete(request, response);
		}else if("a".equals(type)){
			System.out.println("adada");
			check(request, response);
			
			
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
	 * 此方法查询了所有报销类型和报销信息
	 * 分页的显示
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void FindAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataUtil datautil=new DataUtil();
		List<Finance> list=fsl.FinanceFindAll();
		//查询所有出纳付款
		List<ReimTypeTab> qqq= rsl.FindAll();//查询报销类型
		String spage=(String) request.getParameter("page");//把page从datautil哪里传过来
		System.out.println(spage);
		String snum=(String) request.getParameter("num");
		int page=datautil.CorverInt(spage, 1);//默认显示第一页
		System.out.println(page);
		int num=datautil.CorverInt(snum, 5);//每页显示2条	
		System.out.println(num);		
		StringBuffer bar=datautil.creatrBar(list,num,page,this.getClass().getSimpleName());	
		//得到分页信息，上一页和下一页
		System.out.println(bar);
		list=datautil.pagingData(list, num, page);
		System.out.println(list);
		request.setAttribute("bar", bar);
		request.setAttribute("list", list);
		request.setAttribute("qqq", qqq);
		request.getRequestDispatcher("demo/Finance.jsp").forward(request, response);
	}
	
	/**
	 * 此方法用于点击通过过后，在出纳付款页面删除此条消息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a=Integer.parseInt(request.getParameter("delete"));
		fsl.FinanceDelete(a);
		FindAll(request, response);
	}

	/**
	 * 根据输入报销单号查查询，模糊查询
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("name");
		String c=a.toUpperCase();
		System.out.println(c);
		String b = c.substring(0, 2);
		if (b.equalsIgnoreCase("CL") || b.equalsIgnoreCase("ZS") || b.equalsIgnoreCase("QT") || b.equalsIgnoreCase("JT")) {
			List<Finance> aaa = rsl.FindByApp_abb(c);
			request.setAttribute("list", aaa);
			request.getRequestDispatcher("demo/Finance.jsp").forward(request, response);
		}
			FindAll(request, response);
	}

}
