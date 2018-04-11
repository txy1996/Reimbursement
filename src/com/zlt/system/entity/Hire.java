package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;



/**
*@author  米邓勇
*@date 2018/1/22
*@explain 定义实体类
*/
@Bean("artical")
public class Hire {
	@Id("GUID")
	private String hireID;					
	
	@Column("articalTitle")
	private String hireName;				
	
	@Column("articalContent")
	private String hireContent;				
	
	@Column("articalType")
	private int hireType;				
	
	@Column("articalAuthor")
	private String hireAuthor;			
	
	@Column("articalTime")
	private Date hireTime;				


	
	
	

	@Override
	public String toString() {
		return "Hire [hireID=" + hireID + ", hireName=" + hireName + ", hireContent=" + hireContent + ", hireType="
				+ hireType + ", hireAuthor=" + hireAuthor + ", hireTime=" + hireTime + "]";
	}

	public String getHireID() {
		return hireID;
	}

	public void setHireID(String hireID) {
		this.hireID = hireID;
	}
	public String getHireName() {
		return hireName;
	}

	public void setHireName(String hireName) {
		this.hireName = hireName;
	}

	public String getHireContent() {
		return hireContent;
	}

	public void setHireContent(String hireContent) {
		this.hireContent = hireContent;
	}

	public int getHireType() {
		return hireType;
	}

	public void setHireType(int hireType) {
		this.hireType = hireType;
	}

	public String getHireAuthor() {
		return hireAuthor;
	}

	public void setHireAuthor(String hireAuthor) {
		this.hireAuthor = hireAuthor;
	}

	public Date getHireTime() {
		return hireTime;
	}

	public void setHireTime(Date hireTime) {
		this.hireTime = hireTime;
	}
	
}
