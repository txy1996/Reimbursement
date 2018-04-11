package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;
import com.zlt.system.annotation.Number;

/**
 * 其他类型报销表的实体类
 * @author 晓煜 知了堂项目Java三组
 * @date 2018年1月22日21:42:48
 * @explain 其他类型报销表的实体类
 */
@Bean("other")
public class Other {
	@Id("other_id")
	 private int  other_id;
	@Column("reim_id")
	private int reim_id;
	@Column("other_money")
	private int other_money;
	@Column("other_time")
	private Date other_time;
	@Column("other_reason")
	private String other_reason;
	@Column("emp_name")
	private String emp_name;
	@Column("other_remarks")
	private String other_remarks;
	@Column("other_title")
	private String other_title;
	@Column("department_name")
	private String department_name;
	@Number("app_abb")
	private String app_abb;
	public int getOther_id() {
		return other_id;
	}
	public void setOther_id(int other_id) {
		this.other_id = other_id;
	}

	public int getReim_id() {
		return reim_id;
	}
	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}
	public int getOther_money() {
		return other_money;
	}
	public void setOther_money(int other_money) {
		this.other_money = other_money;
	}

	public Date getOther_time() {
		return other_time;
	}
	public void setOther_time(Date other_time) {
		this.other_time = other_time;
	}
	public String getOther_reason() {
		return other_reason;
	}
	public void setOther_reason(String other_reason) {
		this.other_reason = other_reason;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getOther_remarks() {
		return other_remarks;
	}
	public void setOther_remarks(String other_remarks) {
		this.other_remarks = other_remarks;
	}
	
	public String getOther_title() {
		return other_title;
	}
	public void setOther_title(String other_title) {
		this.other_title = other_title;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
	public String getApp_abb() {
		return app_abb;
	}
	public void setApp_abb(String app_abb) {
		this.app_abb = app_abb;
	}
	@Override
	public String toString() {
		return "Other [other_id=" + other_id  + ", reim_id=" + reim_id
				+ ", other_money=" + other_money + ", other_time=" + other_time + ", other_reason=" + other_reason
				+ ", emp_name=" + emp_name + ", other_remarks=" + other_remarks + ", other_title=" + other_title
				+ ", department_name=" + department_name + ", app_abb=" + app_abb + "]";
	}
	/**
	 * 
	 * @param other_id  报销类型ID，主键,自增长
	 * @param other_project 报销项目名称
	 * @param reim_id 报销类型编号，外键
	 * @param other_money 报销金额
	 * @param other_time 提交报销时间
	 * @param other_reason 申请理由
	 * @param emp_name 员工姓名，外键
	 * @param other_remarks 备注
	 * @param other_title 报销单标题
	 * @param department_name 部门名称
	 * @param mxid 报销单编号
	 */
	public Other(int other_id, int reim_id, int other_money, Date other_time, String other_reason,
			String emp_name, String other_remarks, String other_title, String department_name, String app_abb) {
		super();
		this.other_id = other_id;
		this.reim_id = reim_id;
		this.other_money = other_money;
		this.other_time = other_time;
		this.other_reason = other_reason;
		this.emp_name = emp_name;
		this.other_remarks = other_remarks;
		this.other_title = other_title;
		this.department_name = department_name;
		this.app_abb = app_abb;
	}
	public Other() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
