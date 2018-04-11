package com.zlt.system.service;

import java.util.List;

import com.zlt.system.entity.Employee;

/**
 * 用于获取个人报表界面所需数据的业务层接口
 * @author 晓煜
 * @date2018年1月24日下午1:48:21
 * @version 1.0
 * @explain
 */
public interface Reports {
	
	/**
	 * 用于获取各个报销类型数量的接口方法
	 * @param employee 传入员工实体对象 具体信息：员工姓名
	 * @return 返回 
	 */
	List<?> ReportsFindById(Employee employee);
	/**
	 * 用于获取报销通过数量的接口方法
	 * @param employee employee 传入员工实体对象 具体信息：员工姓名
	 * @return
	 */
	List<?>ReportsFindPass(Employee employee);
	/**
	 * 用于获取报销未通过数量的接口方法
	 * @param employee 传入员工实体对象 具体信息：员工姓名
	 * @return
	 */
	List<?>ReportsFindNotPassed(Employee employee);
}
