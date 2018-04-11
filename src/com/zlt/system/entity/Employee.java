package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 员工表的实体类
 * @author 晓煜 知了堂项目Java三组
 * @date 2018年1月22日20:28:43
 * @explain 员工表的实体类
 */
@Bean("emp")
public class Employee {
	@Column("emp_status")
	private String emp_status;
	@Id("emp_id")
	private String emp_id;
	@Column("emp_name")
	private String emp_name;
	@Column("emp_img")
	private String emp_img;
	@Column("emp_pin")
	private String emp_pin;
	@Column("emp_sex")
	private String emp_sex;
	@Column("emp_birth")
	private Date emp_birth;
	@Column("emp_hiredate")
	private Date emp_hiredate;
	@Column("emp_tel")
	private String emp_tel;
	@Column("emp_address")
	private String emp_address;
	@Column("emp_email")
	private String emp_email;
	@Column("emp_backcard")
	private String emp_bankcard;
	@Column("post_id")
	private int post_id;
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
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param emp_status  员工状态 默认情况下为 在职
	 * @param emp_id  员工工号，主键
	 * @param emp_name 员工姓名
	 * @param emp_img 员工头像
	 * @param emp_pin 员工密码
	 * @param emp_sex 员工性别
	 * @param emp_birth 员工出生日期
	 * @param emp_hiredate 入职时间
	 * @param emp_tel 电话
	 * @param emp_address 地址
	 * @param emp_email 邮件
	 * @param emp_bankcard 银行卡号
	 * @param post_id 职位，外键
	 */
	public Employee(String emp_status, String emp_id, String emp_name, String emp_img, String emp_pin, String emp_sex,
			Date emp_birth, Date emp_hiredate, String emp_tel, String emp_address, String emp_email,
			String emp_bankcard, int post_id) {
		super();
		this.emp_status = emp_status;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_img = emp_img;
		this.emp_pin = emp_pin;
		this.emp_sex = emp_sex;
		this.emp_birth = emp_birth;
		this.emp_hiredate = emp_hiredate;
		this.emp_tel = emp_tel;
		this.emp_address = emp_address;
		this.emp_email = emp_email;
		this.emp_bankcard = emp_bankcard;
		this.post_id = post_id;
	}
	
	/**
	 * 
	 * @param emp_name 员工姓名
	 * @explain 用于根据姓名查询员工信息的传输实体
	 */
	public Employee(String emp_name) {
		super();
		this.emp_name = emp_name;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_status=" + emp_status + ", emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_img="
				+ emp_img + ", emp_pin=" + emp_pin + ", emp_sex=" + emp_sex + ", emp_birth=" + emp_birth
				+ ", emp_hiredate=" + emp_hiredate + ", emp_tel=" + emp_tel + ", emp_address=" + emp_address
				+ ", emp_email=" + emp_email + ", emp_bankcard=" + emp_bankcard + ", post_id=" + post_id + "]";
	}
	public Date getEmp_birth() {
		return emp_birth;
	}
	public void setEmp_birth(Date emp_birth) {
		this.emp_birth = emp_birth;
	}
	public Date getEmp_hiredate() {
		return emp_hiredate;
	}
	public void setEmp_hiredate(Date emp_hiredate) {
		this.emp_hiredate = emp_hiredate;
	}
	/**
	 * 
	 * @param emp_name 员工名字
	 * @param emp_pin 员工密码
	 * @explain 用于修改密码的传输实体
	 */
	public Employee(String emp_name, String emp_pin) {
		super();
		this.emp_name = emp_name;
		this.emp_pin = emp_pin;
	}
	public Employee(String emp_name, String emp_img, String emp_pin) {
		super();
		this.emp_name = emp_name;
		this.emp_img = emp_img;
		this.emp_pin = emp_pin;
	}
	public Employee(String emp_id, String emp_name, String emp_pin, String emp_tel, String emp_address,
			String emp_email, String emp_bankcard) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_pin = emp_pin;
		this.emp_tel = emp_tel;
		this.emp_address = emp_address;
		this.emp_email = emp_email;
		this.emp_bankcard = emp_bankcard;
	}
	public Employee(String emp_id, String emp_name, String emp_sex, Date emp_birth, Date emp_hiredate, String emp_tel,
			String emp_address, String emp_email, String emp_bankcard) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sex = emp_sex;
		this.emp_birth = emp_birth;
		this.emp_hiredate = emp_hiredate;
		this.emp_tel = emp_tel;
		this.emp_address = emp_address;
		this.emp_email = emp_email;
		this.emp_bankcard = emp_bankcard;
	}
	
	
}
