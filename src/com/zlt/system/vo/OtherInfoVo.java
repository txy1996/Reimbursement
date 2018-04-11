package com.zlt.system.vo;
/**
 * 其他类型详情查询
 * @author 任义平
 *
 */
public class OtherInfoVo {
	private String other_project;
	private String other_time;
	private String other_reason;
	private String other_remarks;
	private int other_money;
	private String status1_opinion;
	public String getOther_project() {
		return other_project;
	}
	public void setOther_project(String other_project) {
		this.other_project = other_project;
	}
	public String getOther_time() {
		return other_time;
	}
	public void setOther_time(String other_time) {
		this.other_time = other_time;
	}
	public String getOther_reason() {
		return other_reason;
	}
	public void setOther_reason(String other_reason) {
		this.other_reason = other_reason;
	}
	public String getOther_remarks() {
		return other_remarks;
	}
	public void setOther_remarks(String other_remarks) {
		this.other_remarks = other_remarks;
	}
	public int getOther_money() {
		return other_money;
	}
	public void setOther_money(int other_money) {
		this.other_money = other_money;
	}
	public String getStatus1_opinion() {
		return status1_opinion;
	}
	public void setStatus1_opinion(String status1_opinion) {
		this.status1_opinion = status1_opinion;
	}
	public OtherInfoVo(String other_project, String other_time, String other_reason, String other_remarks,
			int other_money, String status1_opinion) {
		super();
		this.other_project = other_project;
		this.other_time = other_time;
		this.other_reason = other_reason;
		this.other_remarks = other_remarks;
		this.other_money = other_money;
		this.status1_opinion = status1_opinion;
	}
	public OtherInfoVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OtherInfoVo [other_project=" + other_project + ", other_time=" + other_time + ", other_reason="
				+ other_reason + ", other_remarks=" + other_remarks + ", other_money=" + other_money
				+ ", status1_opinion=" + status1_opinion + "]";
	}
	
}
