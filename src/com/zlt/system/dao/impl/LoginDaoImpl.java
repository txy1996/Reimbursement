package com.zlt.system.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.handlers.BeanListHandler;
import com.zlt.system.dao.LoginDao;
import com.zlt.system.entity.Employee;
import com.zlt.system.entity.Position;
import com.zlt.system.util.DBUtil;

/**
 * LoginDao的实现类
 * 包含一个Login(User user)方法
 * @author xinzou
 */

public class LoginDaoImpl implements LoginDao {
	EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
	/**
	 * login方法实现
	 * @return 是否找到该对象
	 */
	@Override
	public int login(Employee employee) {
		String sql="SELECT posi.position_level FROM emp JOIN posi ON emp.post_id=posi.position_id WHERE emp.emp_name=? AND emp.emp_pin=?";
		ArrayList<Position> arrayList = null;
		try {
			arrayList =  (ArrayList<Position>) DBUtil.getQueryRunner().query(sql,  new BeanListHandler<Position>(Position.class),employee.getEmp_name(),employee.getEmp_pin());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (arrayList.size()==0) {
			Position position = new Position();
			position.setPosition_level(0);
			arrayList.add(position);
		}
		return arrayList.get(0).getPosition_level();
	}

}
