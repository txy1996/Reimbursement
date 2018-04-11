package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 职位表的实体类
 * @author 米邓勇
 *
 */
@Bean("posi")
public class Position {
	@Id("position_id")
	private int position_id;
	
	@Column("position_name")
	private String position_name;
	
	@Column("position_level")
	private int position_level;
	
	@Column("department_id")
	private int department_id;

	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	public String getPosition_name() {
		return position_name;
	}

	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}

	public int getPosition_level() {
		return position_level;
	}

	public void setPosition_level(int position_level) {
		this.position_level = position_level;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return "Position [position_id=" + position_id + ", position_name=" + position_name + ", position_level="
				+ position_level + ", department_id=" + department_id + "]";
	}

	public Position(int position_id, String position_name, int position_level, int department_id) {
		super();
		this.position_id = position_id;
		this.position_name = position_name;
		this.position_level = position_level;
		this.department_id = department_id;
	}

	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
