package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 单据表实现类
 * @author 米邓勇
 */
@Bean("bills")
public class Bills {
	@Id("bills_id")
	private int bills_id;
	
	@Column("app_id")
	private int app_id;
	
	@Column("bills_img")
	private  String bills_img;

	public int getBills_id() {
		return bills_id;
	}

	public void setBills_id(int bills_id) {
		this.bills_id = bills_id;
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	

	public String getBills_img() {
		return bills_img;
	}

	public void setBills_img(String bills_img) {
		this.bills_img = bills_img;
	}

	

	@Override
	public String toString() {
		return "Bills [bills_id=" + bills_id + ", app_id=" + app_id + ", bills_img=" + bills_img + "]";
	}

	

	public Bills(int bills_id, int app_id, String bills_img) {
		super();
		this.bills_id = bills_id;
		this.app_id = app_id;
		this.bills_img = bills_img;
	}

	public Bills() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
