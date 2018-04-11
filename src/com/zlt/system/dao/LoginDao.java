package com.zlt.system.dao;

import com.zlt.system.entity.Employee;

/**
 * 登录Dao类
 * 包含一个login方法接口
 * @author xinzou
 *
 */
public interface LoginDao  {

	/**
	 * login方法接口
	 * @param user
	 * @return 是否找到该对象
	 */
	public int login(Employee employee);
	
}
