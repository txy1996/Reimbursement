package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 申请状态表的实体类
 * @author 晓煜
 *@date 2018年1月22日22:34:08
 *@explain 申请状态表的实体类
 */
@Bean("status")
public class Status {
	@Id("status_id")
	private int status_id;
	@Column("app_abb")
	private String app_abb;
	@Column("status1")
	private String status1;
	@Column("status1_time")
	private Date status1_time;
	@Column("status1_opinion")
	private String status1_opinion;
	@Column("status2")
	private String status2;
	@Column("status2_time")
	private Date  status2_time;
	@Column("status2_opinion")
	private String  status2_opinion;
	@Column("status_result")
	private String  status_result;
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public String getApp_abb() {
		return app_abb;
	}
	public void setApp_abb(String app_abb) {
		this.app_abb = app_abb;
	}
	public String getStatus1() {
		return status1;
	}
	public void setStatus1(String status1) {
		this.status1 = status1;
	}
	
	public Date getStatus1_time() {
		return status1_time;
	}
	public void setStatus1_time(Date status1_time) {
		this.status1_time = status1_time;
	}
	public String getStatus1_opinion() {
		return status1_opinion;
	}
	public void setStatus1_opinion(String status1_opinion) {
		this.status1_opinion = status1_opinion;
	}
	public String getStatus2() {
		return status2;
	}
	public void setStatus2(String status2) {
		this.status2 = status2;
	}
	public Date getStatus2_time() {
		return status2_time;
	}
	public void setStatus2_time(Date status2_time) {
		this.status2_time = status2_time;
	}
	public String getStatus2_opinion() {
		return status2_opinion;
	}
	public void setStatus2_opinion(String status2_opinion) {
		this.status2_opinion = status2_opinion;
	}
	public String getStatus_result() {
		return status_result;
	}
	public void setStatus_result(String status_result) {
		this.status_result = status_result;
	}
	/**
	 * 
	 * @param status_id 申请状态编号，主键,自增长
	 * @param app_abb 报销id，外键/报销编号表中
	 * @param status1 部门主管审批状态
	 * @param status1_time 部门主管审批时间
	 * @param status1_opinion 部门主管审批意见
	 * @param status2 财务审批状态
	 * @param status2_time 财务审批时间
	 * @param status2_opinion 财务审批意见
	 * @param status_result 财务审批结果
	 */
	public Status(int status_id, String app_abb, String status1, Date status1_time, String status1_opinion,
			String status2, Date status2_time, String status2_opinion, String status_result) {
		super();
		this.status_id = status_id;
		this.app_abb = app_abb;
		this.status1 = status1;
		this.status1_time = status1_time;
		this.status1_opinion = status1_opinion;
		this.status2 = status2;
		this.status2_time = status2_time;
		this.status2_opinion = status2_opinion;
		this.status_result = status_result;
	}
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", app_abb=" + app_abb + ", status1=" + status1 + ", status1_time="
				+ status1_time + ", status1_opinion=" + status1_opinion + ", status2=" + status2 + ", status2_time="
				+ status2_time + ", status2_opinion=" + status2_opinion + ", status_result=" + status_result + "]";
	}

	
}
