package com.zlt.system.service;

import com.zlt.system.entity.Employee;
import com.zlt.system.vo.Line;

/**
 * 用于个人信息设置，包括修改密码的业务层接口
 * @author 晓煜
 * @date2018年1月23日下午7:20:16
 * @version
 * @explain
 */
public interface EmployeeService {
	/**
	 * 为个人信息界面提供数据
	 * @param employee 传入员工类实体，传入员工姓名
	 * @return  员工vo类 ，带部门，和职位
	 */
 Line EmployeeServiceFindById(Employee employee);
/**
 * 为个人信息界面提供修改功能
 * @param employee 传入员工类实体对象
 * @return 返回状态，true为修改成功
 */
 boolean EmployeeServiceUpdate(Employee employee);
 /**
  * 为个人信息设置提供修改方法
  * @param employee 传入员工类实体对象
  * @return 返回状态，true为修改成功
  */
 boolean EmployeeServiceChangePassword(Employee employee);
 /**
  * 为个人信息设置提供修改个人头像的方法
  * @param employee 传入员工类实体对象具体参数为姓名和图片路径
  * @return 返回状态，true为修改成功
  */
 boolean EmployeeServicePicture(Employee employee);
 /**
  * 为个人信息设置密码修改功能提供验证密码的功能
  * @param employee
  * @return
  */
 Employee EmployeeServiceCheckPasswoed(Employee employee);
}
