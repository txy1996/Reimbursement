package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 报销类型表的实体类
 * @author 米邓勇
 *
 */
@Bean("reimtypetab")
public class ReimTypeTab {
	@Id("reim_id")
	private int reim_id;
	
	@Column("reim_type")
	private String reim_type;
	
	@Column("reim_abb")
	private String reim_abb;

	public int getReim_id() {
		return reim_id;
	}

	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}

	public String getReim_type() {
		return reim_type;
	}

	public void setReim_type(String reim_type) {
		this.reim_type = reim_type;
	}

	public String getReim_abb() {
		return reim_abb;
	}

	public void setReim_abb(String reim_abb) {
		this.reim_abb = reim_abb;
	}

	@Override
	public String toString() {
		return "ReimTypeTab [reim_id=" + reim_id + ", reim_type=" + reim_type + ", reim_abb=" + reim_abb + "]";
	}

	public ReimTypeTab(int reim_id, String reim_type, String reim_abb) {
		super();
		this.reim_id = reim_id;
		this.reim_type = reim_type;
		this.reim_abb = reim_abb;
	}

	public ReimTypeTab() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
