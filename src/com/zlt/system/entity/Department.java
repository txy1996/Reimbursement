package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 部门表实体类
 * @author 米邓勇
 *
 */
@Bean("department")
public class Department {
	@Id("department_id")
	private int department_id;
	
	@Column("department_name")
	private String department_name;
	
	@Column("department_address")
	private String department_address;
	
	@Column("department_type")
	private String department_type;
	
	@Column("department_budget")
	private String department_budget;

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_address() {
		return department_address;
	}

	public void setDepartment_address(String department_address) {
		this.department_address = department_address;
	}

	public String getDepartment_type() {
		return department_type;
	}

	public void setDepartment_type(String department_type) {
		this.department_type = department_type;
	}

	public String getDepartment_budget() {
		return department_budget;
	}

	public void setDepartment_budget(String department_budget) {
		this.department_budget = department_budget;
	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name
				+ ", department_address=" + department_address + ", department_type=" + department_type
				+ ", department_budget=" + department_budget + "]";
	}

	public Department(int department_id, String department_name, String department_address, String department_type,
			String department_budget) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.department_address = department_address;
		this.department_type = department_type;
		this.department_budget = department_budget;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
