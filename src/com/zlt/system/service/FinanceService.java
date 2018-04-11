package com.zlt.system.service;

import java.util.List;

import com.zlt.system.entity.Finance;

	/**
	 * 此接口service层对财务表的逻辑判断
	 * @author 冯杨 知了堂项目java三组
	 * @date 2018年1月23日14:23
	 * @explain 此接口用于service层对财务表的逻辑判断
	 */
public interface FinanceService {
	
	/**
	 * 用于判断是否增加信息成功，标准是几行受影响
	 * @param finance 传入一个对象
	 * @return 返回一个整型，判断是否增加成功
	 * @explain 此接口方法用于判断是否增加信息成功
	 */
	int FinanceInsert1(Finance finance);
	
	/**
	 * 用于判断是否增加信息成功，标准是几行受影响
	 * @param finance 传入一个对象
	 * @return 返回一个boolean型，判断是否增加成功
	 * @explain 此接口方法用于判断是否增加信息成功
	 */
	boolean FinanceInsert2(Finance finance);
	/**
	 * 用于判断是否删除信息成功
	 * @param id
	 * @return 返回一个整型，判断是否删除成功
	 * @explain 此接口方法用于判断是否删除信息成功
	 */		
	int FinanceDelete(int id);
	
	/**
	 * 判断成功标准是几行受影响
	 * @param finance 对象
	 * @return  返回一个整型，判断是否删除成功
	 * @explain 此接口接口方法用于判断是否更新信息成功
	 */	
	int FinanceUpdate(Finance finance);
	
	/**
	 * 用于判断是否根据id查询信息成功 如果集合不为空，就说明查询成功
	 * @param id
	 * @return 返回一个集合
	 * @explain 此接口接口方法用于判断是否根据id查询信息成功
	 */	
	Finance FinanceFindById(int id);
	
	/**
	 * 用于判断是否查询全部信息成功 如果对象不为空，就说明查询成功
	 * @return 
	 * @explain 此接口方法用于判断是否全部查询信息成功
	 */
	List<Finance> FinanceFindAll();
}
