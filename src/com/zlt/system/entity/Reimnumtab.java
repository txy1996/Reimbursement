package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 报销编号表的实体类
 * @author 晓煜  知了堂项目Java三组
 * @date 2018年1月22日20:59:48
 * @explain  报销编号表的实体类
 *
 */
@Bean("reimnumtab")
public class Reimnumtab {
	 @Id("number_id")
	private int  number_id;
	@Column("app_id")
	 private int app_id;
	@Column("app_abb")
	private String app_abb;
	public int getNumber_id() {
		return number_id;
	}
	public void setNumber_id(int number_id) {
		this.number_id = number_id;
	}
	
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	
	public Reimnumtab() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param number_id 报销编号，主键,自增长
	 * @param app_type 报销类型编号，外键
	 * @param app_add 报销id//拼接过后的值
	 */
	public Reimnumtab(int number_id, int app_id, String app_abb) {
		super();
		this.number_id = number_id;
		this.app_id = app_id;
		this.app_abb = app_abb;
	}
	@Override
	public String toString() {
		return "Reimnumtab [number_id=" + number_id + ", app_id=" + app_id + ", app_abb=" + app_abb + "]";
	}
	public String getApp_abb() {
		return app_abb;
	}
	public void setApp_abb(String app_abb) {
		this.app_abb = app_abb;
	}
	
	
	 
}
