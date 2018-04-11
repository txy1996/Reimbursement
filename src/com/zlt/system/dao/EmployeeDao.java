package com.zlt.system.dao;

import java.util.ArrayList;
import java.util.List;

import com.zlt.system.entity.Employee;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.Line;

/**
 * 用于操作员工表的接口方法 包含 EmployeeFindAll，EmployeeFindById，EmployeeUpdate，EmployeeChangePassword
 * @author 晓煜 知了堂项目Java三组
 * @date2018年1月23日上午9:03:54
 * @explain 用于操作员工表的接口方法
 */
public interface EmployeeDao  {
	/**
	 * 用于查询所有员工信息
	 * @return 返回员工类的实体对象集合
	 * @explain 用于查询所有员工信息
	 */
	ArrayList<Employee> EmployeeFindAll();
	/**
	 * 根据员工编号查询员工信息
	 * @param employee 传入员工实体对象
	 * @return 返回员工VO实体对象
	 * @explain 根据员工编号查询员工信息
	 */
	Line EmployeeFindById(Employee employee);
	/**
	 * 用于修改员工基本资料，加上部门，和职位
	 * @param employee 传入员工实体对象
	 *  @return 返回1为修改成功
	 */
	int  EmployeeUpdate(Employee employee);
	 /**
	  * 
	  * @param employee 传入员工实体对象
	  * @explain 用于修改员工密码
	  * @return  返回1为修改成功
	  */
	int  EmployeeChangePassword(Employee employee);
	/**
	 * 用于添加 员工,
	 * @param employee 传入员工类实体对象
	 * @return  返回添加状态，1为添加成功
	 */
	int EmployeeInsert(Employee employee);
	/**
	 * 用于删除员工信息
	 * @param employee 员工类实体对象
	 * @return  返回状态，1为删除成功
	 */
	int EmployeeDelete(Employee employee);
	/**
	 * 
	 * @param employee 传入员工实体类，姓名和密码
	 * @return 员工实体对象
	 */
	 Employee login(Employee employee);
	 /**
	  * 
	  * @param employee  传入员工实体类，图片路径
	  * @return 返回状态，1为成功
	  */
	 int EmployeePicture(Employee employee);
	 /**
	  * @author 刘俊泽
	  * 查询单号
	  */
	 public List<ApplyreimVo> AppByid(String app_abb,String emp_name,String reim_type);
	 /**
	  * @author 刘俊泽
	  * 查询报销人
	  */
	 public ApplyreimVo AppByApp_abb(String id);
}
