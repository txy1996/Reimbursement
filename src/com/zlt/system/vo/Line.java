package com.zlt.system.vo;
/**
 * 员工信息的传输类，加上职位，部门
 * @author 晓煜
 * @date2018年1月23日下午3:09:00
 * @version
 * @explain
 */
public class Line {
	private String department_name;
	private String position_name;
	private String emp_status;
	private String emp_id;
	private String emp_name;
	private String emp_img;
	private String emp_hiredate;
	private String emp_pin;
	private String emp_sex;
	private String emp_birth;
	private String emp_tel;
	private String emp_address;
	private String emp_email;
	private String emp_bankcard;
	
	/**
	 * 
	 * @param department_name 部门
	 * @param position_name 职位
	 * @param emp_status 员工状态 默认情况下为 在职
	 * @param emp_id 员工工号，主键
	 * @param emp_name 员工姓名
	 * @param emp_img 员工头像
	 * @param emp_hiredate 入职时间
	 * @param emp_pin 员工密码
	 * @param emp_sex 员工性别
	 * @param emp_birth 员工出生日期
	 * @param emp_tel 电话 
	 * @param emp_address 地址
	 * @param emp_email 邮件
	 * @param emp_bankcard 银行卡号
	 */
	public Line(String department_name, String position_name, String emp_status, String emp_id, String emp_name,
			String emp_img, String emp_hiredate, String emp_pin, String emp_sex, String emp_birth, String emp_tel,
			String emp_address, String emp_email, String emp_bankcard) {
		super();
		this.department_name = department_name;
		this.position_name = position_name;
		this.emp_status = emp_status;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_img = emp_img;
		this.emp_hiredate = emp_hiredate;
		this.emp_pin = emp_pin;
		this.emp_sex = emp_sex;
		this.emp_birth = emp_birth;
		this.emp_tel = emp_tel;
		this.emp_address = emp_address;
		this.emp_email = emp_email;
		this.emp_bankcard = emp_bankcard;
	}
	public Line(String department_name, String position_name, String emp_status, String emp_id, String emp_name,
			String emp_img, String emp_pin, String emp_sex, String emp_birth, String emp_tel, String emp_address,
			String emp_email, String emp_bankcard) {
		super();
		this.department_name = department_name;
		this.position_name = position_name;
		this.emp_status = emp_status;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_img = emp_img;
		this.emp_pin = emp_pin;
		this.emp_sex = emp_sex;
		this.emp_birth = emp_birth;
		this.emp_tel = emp_tel;
		this.emp_address = emp_address;
		this.emp_email = emp_email;
		this.emp_bankcard = emp_bankcard;
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
	public String getEmp_status() {
		return emp_status;
	}
	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}
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
	public String getEmp_img() {
		return emp_img;
	}
	public void setEmp_img(String emp_img) {
		this.emp_img = emp_img;
	}
	public String getEmp_pin() {
		return emp_pin;
	}
	public void setEmp_pin(String emp_pin) {
		this.emp_pin = emp_pin;
	}
	public String getEmp_sex() {
		return emp_sex;
	}
	public void setEmp_sex(String emp_sex) {
		this.emp_sex = emp_sex;
	}
	public String getEmp_birth() {
		return emp_birth;
	}
	public void setEmp_birth(String emp_birth) {
		this.emp_birth = emp_birth;
	}
	public String getEmp_tel() {
		return emp_tel;
	}
	public void setEmp_tel(String emp_tel) {
		this.emp_tel = emp_tel;
	}
	public String getEmp_address() {
		return emp_address;
	}
	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_bankcard() {
		return emp_bankcard;
	}
	public void setEmp_bankcard(String emp_bankcard) {
		this.emp_bankcard = emp_bankcard;
	}
	
	public String getEmp_hiredate() {
		return emp_hiredate;
	}
	public void setEmp_hiredate(String emp_hiredate) {
		this.emp_hiredate = emp_hiredate;
	}
	public Line() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Line [department_name=" + department_name + ", position_name=" + position_name + ", emp_status="
				+ emp_status + ", emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_img=" + emp_img
				+ ", emp_hiredate=" + emp_hiredate + ", emp_pin=" + emp_pin + ", emp_sex=" + emp_sex + ", emp_birth="
				+ emp_birth + ", emp_tel=" + emp_tel + ", emp_address=" + emp_address + ", emp_email=" + emp_email
				+ ", emp_bankcard=" + emp_bankcard + "]";
	}
	public Line(String emp_id) {
		super();
		this.emp_id = emp_id;
	}
	
}
