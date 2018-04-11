package com.zlt.system.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zlt.system.dao.EmployeeDao;
import com.zlt.system.entity.Employee;
import com.zlt.system.util.DBUtil;
import com.zlt.system.vo.ApplyreimVo;
import com.zlt.system.vo.Line;
/**
 * 数据库员工表的操作类
 * @author 晓煜
 * @date2018年1月23日下午3:26:33
 * @version 1.0
 * @explain
 */
public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public ArrayList<Employee> EmployeeFindAll() {
		// TODO Auto-generated method stub
		String sql="SELECT *FROM emp";
		ArrayList<Employee>employees=new ArrayList<Employee>();
		try {
			employees=(ArrayList<Employee>) DBUtil.getQueryRunner().query(sql,  new BeanListHandler<Employee>(Employee.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Line EmployeeFindById(Employee employee) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM emp,"
				+"(SELECT posi.`position_name`,department.`department_name`,posi.`position_id` "
				+"FROM posi,department WHERE posi.`department_id`=department.`department_id`)m"
				+"  WHERE  emp.`emp_name`=?  AND emp.`post_id`=m.position_id";
		Line line=null;
		try {
			line =DBUtil.getQueryRunner().query(sql, new BeanHandler<Line>(Line.class), employee.getEmp_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int EmployeeUpdate(Employee employee) {
		// TODO Auto-generated method stub
		String sql="UPDATE emp SET "
				+"emp.`emp_name`=?,"
				+"emp.`emp_sex`=?,"
				+"emp.`emp_birth`=?,"
				+"emp.`emp_hiredate`=?,"
				+"emp.`emp_tel`=?,"
				+"emp.`emp_email`=?,"
				+"emp.`emp_bankcard`=?,"
				+"emp.`emp_address`=?"
				+"WHERE emp.`emp_id`=?";
		int state=0;
		try {
			state=DBUtil.getQueryRunner().update(sql,employee.getEmp_name(),
					employee.getEmp_sex(),
					employee.getEmp_birth(),
					employee.getEmp_hiredate(),
					employee.getEmp_tel(),
					employee.getEmp_email(),
					employee.getEmp_bankcard(),
					employee.getEmp_address(),
					employee.getEmp_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return state;
	}

	@Override
	public int EmployeeChangePassword(Employee employee) {
		// TODO Auto-generated method stub
		String sql="UPDATE emp SET emp_pin=? WHERE emp_name=?";
		int state=0;
		try {
			state=DBUtil.getQueryRunner().update(sql,employee.getEmp_pin(),employee.getEmp_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return state;
	}

	@Override
	public int EmployeeInsert(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int EmployeeDelete(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}
//	public static void main(String[] args) {
//		EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
//		System.out.println("mmmmm");
//		System.out.println("EmployeeDaoImpl.main()");
//		Employee employee=new Employee("mqq","mqq");
//		System.out.println(employeeDaoImpl.login(employee).toString());
//		
//	}

	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		String sql="SELECT *FROM emp WHERE emp.`emp_name`=? AND emp.`emp_pin`=? ";
		Employee employee2=null;
		try {
			employee2=DBUtil.getQueryRunner().query(sql,new BeanHandler<Employee>(Employee.class),employee.getEmp_name(),employee.getEmp_pin());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee2;
	}

	@Override
	public int EmployeePicture(Employee employee) {
		// TODO Auto-generated method stub
		String sql="UPDATE emp SET emp.`emp_img`=? WHERE emp.`emp_name`=?";
		int state=0;
		try {
			state=DBUtil.getQueryRunner().update(sql,employee.getEmp_img(),employee.getEmp_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return state;
	}
	/**
	 * 测试
	 * @param args
	 */
//	public static void main(String[] args) {
//	EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
//	String id="CL22";
//	ApplyreimVo c=employeeDaoImpl.AppByApp_abb(id);
//		System.out.println(c.toString());
//}
/**
 * @author 刘俊泽
 * 根据单号查询
 */
	@Override
	public List<ApplyreimVo> AppByid(String app_abb,String emp_name,String reim_type ) {
		// TODO Auto-generated method stub
		List<ApplyreimVo> b = null;
		String sql="SELECT * FROM (SELECT status1,a.reim_type,a.emp_name,a.department_name,a.app_abb,a.money FROM STATUS,"
+" (SELECT reim_type,emp_name,department_name,app_abb,hotel_quarterage AS money FROM hotel,reimtypetab WHERE hotel.`reim_id`=reimtypetab.`reim_id`"
+" UNION"	
+" SELECT reim_type,emp_name,department_name,app_abb,other_money AS money FROM other,reimtypetab WHERE other.`reim_id`=reimtypetab.`reim_id`"
+" UNION"
+" SELECT reim_type,emp_name,department_name,app_abb,traffic_money AS money FROM traffic,reimtypetab WHERE traffic.`reim_id`=reimtypetab.`reim_id`"
+" UNION"
+" SELECT reim_type,emp_name,department_name,app_abb,travel_money AS money FROM travel,reimtypetab WHERE travel.`reim_id`=reimtypetab.`reim_id`) a " 
+" WHERE  status.`app_abb` IN (a.app_abb)) b WHERE 1=1 AND status1='审核中'";
		if(app_abb!=null&&!app_abb.equals("")){
			sql+="and b.app_abb LIKE '"+app_abb+"%' ";
		}
		if(emp_name!=null&&!emp_name.equals("")){
			sql+="and b.emp_name LIKE '"+emp_name+"%' ";
		}
		if(reim_type!=null&&!reim_type.equals("")){
			sql+="and b.reim_type LIKE '"+reim_type+"%' ";
		}
		 try {
			 b = DBUtil.getQueryRunner().query(sql, new BeanListHandler<ApplyreimVo>(ApplyreimVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return b;
	}
/**
 * @author 刘俊泽
 * 查询报销人
 */
@Override
public ApplyreimVo AppByApp_abb(String id) {
	// TODO Auto-generated method stub
	ApplyreimVo c = new ApplyreimVo();
	QueryRunner runner=new QueryRunner();
	String sql="SELECT b.reim_type,b.emp_name,b.department_name,b.app_abb,b.money\r\n" + 
				"FROM(SELECT status1,status2,a.reim_type,a.emp_name,a.department_name,a.app_abb,a.money\r\n" + 
				"FROM STATUS,\r\n" + 
				"(SELECT reim_type,emp_name,department_name,app_abb,hotel_quarterage AS money FROM hotel,reimtypetab WHERE hotel.`reim_id`=reimtypetab.`reim_id`\r\n" + 
				"UNION	\r\n" + 
				"SELECT reim_type,emp_name,department_name,app_abb,other_money AS money FROM other,reimtypetab WHERE other.`reim_id`=reimtypetab.`reim_id`\r\n" + 
				"UNION\r\n" + 
				"SELECT reim_type,emp_name,department_name,app_abb,traffic_money AS money FROM traffic,reimtypetab WHERE traffic.`reim_id`=reimtypetab.`reim_id`\r\n" + 
				"UNION\r\n" + 
				"SELECT reim_type,emp_name,department_name,app_abb,travel_money AS money FROM travel,reimtypetab WHERE travel.`reim_id`=reimtypetab.`reim_id`) a  \r\n" + 
				"WHERE  status.`app_abb` IN (a.app_abb) AND status1='审核中') b\r\n" + 
				"WHERE app_abb=?";
	try {
		 c = runner.query(DBUtil.getConnection(), sql, new BeanHandler<ApplyreimVo>(ApplyreimVo.class),id);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return c;
}
}
