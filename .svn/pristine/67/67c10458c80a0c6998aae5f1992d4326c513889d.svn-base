package com.zlt.system.service.impl;

//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;

import com.zlt.system.dao.impl.FinanceDaoImpl;
import com.zlt.system.entity.Finance;
import com.zlt.system.service.FinanceService;

	/**
	 * 此service是实现FinanceService接口方法
	 * 
	 * @author 冯杨 知了堂项目java三组
	 * @date 2018年1月23日14:35
	 */
public class FinanceServiceImpl implements FinanceService {
	private FinanceDaoImpl financedao=new FinanceDaoImpl();
	
	/**
	 * 用于判断是否增加信息成功，标准是几行受影响
	 * 
	 * @param finance
	 *            传入一个对象
	 * @return 返回一个整型，判断是否增加成功
	 * @explain 此方法是对FinanceService接口方法的实现，用于判断是否增加信息成功
	 */
	@Override
	public int FinanceInsert1(Finance finance) {
		// TODO Auto-generated method stub
		int a=financedao.FinanceInsert(finance);
		return a;
	}

	/**
	 * 用于判断是否增加信息成功，标准是几行受影响
	 * 
	 * @param finance
	 *            传入一个对象
	 * @return 返回一个boolean型，调用，判断是否增加成功
	 * @explain 此方法是对FinanceService接口方法的实现，用于判断是否增加信息成功
	 */
	@Override
	public boolean FinanceInsert2(Finance finance) {
		// TODO Auto-generated method stub		
		boolean a=financedao.insert_NoID(finance);
		return a;
		
	}
	
	/**
	 * 用于判断是否删除信息成功
	 * 
	 * @param id
	 * @return 返回一个整型，判断是否删除成功
	 * @explain 此方法是对FinanceService接口方法的实现，用于判断是否删除信息成功
	 */
	@Override
	public int FinanceDelete(int id) {
		// TODO Auto-generated method stub
		int a=financedao.FinanceDelete(id);
		return a;
	}

	/**
	 * 判断成功标准是几行受影响
	 * 
	 * @param finance
	 *            对象
	 * @return 返回一个整型，判断是否删除成功
	 * @explain 此方法是对FinanceService接口方法的实现，用于判断是否更新信息成功
	 */
	@Override
	public int FinanceUpdate(Finance finance) {
		// TODO Auto-generated method stub
		int a=financedao.FinanceUpdate(finance);
		return a;
	}

	/**
	 * 用于判断是否根据id查询信息成功 如果对象不为空，就说明查询成功
	 * 
	 * @param id
	 * @return 返回一个对象
	 * @explain 此方法是对FinanceService接口方法的实现，用于判断是否根据id查询信息成功
	 */
	@Override
	public Finance FinanceFindById(int id) {
		// TODO Auto-generated method stub
		Finance finance=financedao.FinanceFindById(2);
		return finance;
	}

	/**
	 * 用于判断是否查询全部信息成功 如果集合不为空，就说明查询成功
	 * 
	 * @return
	 * @explain 此方法是对FinanceService接口方法的实现，用于判断是否全部查询信息成功
	 */
	
	@Override
	public List<Finance> FinanceFindAll() {
		// TODO Auto-generated method stub
		List<Finance> a=financedao.FinanceFindAll();
		return a;
	}
//	public static void main(String[] args) {
//		FinanceServiceImpl financeimpl=new FinanceServiceImpl();
		
//		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
//		
//		Date date;
//		try {
//			date = format.parse("2222-11-10");
//			Finance finance=new Finance(2, "CL1", "已支付", "支付宝支付", 600, date,"aaa");
//			int a=financeimpl.FinanceUpdate(finance);
//			System.out.println(a);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		boolean a=financeimpl.FinanceInsert2(finance);
//		System.out.println(a);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		financeimpl.FinanceDelete(1);
		
//		Finance finance=financeimpl.FinanceFindById(2);
//		System.out.println(finance.toString());
		
//		List<Finance>a=financeimpl.FinanceFindAll();
//		for(Finance b:a){
//			System.out.println(b);
//		}
		
//	}
}
