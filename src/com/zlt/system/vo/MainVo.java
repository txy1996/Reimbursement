package com.zlt.system.vo;

/**
 * 此vo是用于登录后主页显示登录人信息
 * @author fy
 *
 */
public class MainVo {
	private String emp_id;
	private String emp_name;
	private String emp_sex;
	private String department_name;
	private String position_name;
	private String emp_tel;
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_sex() {
		return emp_sex;
	}
	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getPosition_name() {
		return position_name;
	}
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}
	public String getEmp_tel() {
		return emp_tel;
	}
	public void setEmp_tel(String emp_tel) {
		this.emp_tel = emp_tel;
	}
	public MainVo(String emp_id, String emp_name, String emp_sex, String department_name, String position_name,
			String emp_tel) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sex = emp_sex;
		this.department_name = department_name;
		this.position_name = position_name;
		this.emp_tel = emp_tel;
	}
	public MainVo(String emp_id) {
		super();
		this.emp_id = emp_id;
	}
	public MainVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MainVo [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sex=" + emp_sex + ", department_name="
				+ department_name + ", position_name=" + position_name + ", emp_tel=" + emp_tel + "]";
	}
	
	
}
