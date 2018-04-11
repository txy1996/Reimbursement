package com.zlt.system.service.impl;

import com.zlt.system.dao.impl.LoginDaoImpl;
import com.zlt.system.entity.Employee;
import com.zlt.system.service.LoginService;

/**
 * LoginService实现类
 * method:login(User) 实现登录流程
 * return:boolean
 * @author xinzou
 *
 */
public class LoginServiceImpl implements LoginService {
	LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
	
	/**
	 * service层isLogin方法实现
	 * @param employee 员工对象
	 * @return 登陆是否成功
	 */
	@Override
	public int isLogin(String username,String password) {
		Employee employee = new Employee();
		employee.setEmp_name(username);
		employee.setEmp_pin(password);
		int flag = loginDaoImpl.login(employee);
		return flag;
	}

}
