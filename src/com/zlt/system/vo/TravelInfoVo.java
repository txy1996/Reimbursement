package com.zlt.system.vo;
/**
 * 差旅报销详情查询
 * @author 任义平
 *
 */
public class TravelInfoVo {
	private String travel_address;
	private String travel_start;
	private String travel_end;
	private String travel_target;
	private String travel_result;
	private int travel_date;
	private String travel_remark;
	private String reim_type;
	private String status1_opinion;
	public String getTravel_address() {
		return travel_address;
	}
	public void setTravel_address(String travel_address) {
		this.travel_address = travel_address;
	}
	public String getTravel_start() {
		return travel_start;
	}
	public void setTravel_start(String travel_start) {
		this.travel_start = travel_start;
	}
	public String getTravel_end() {
		return travel_end;
	}
	public void setTravel_end(String travel_end) {
		this.travel_end = travel_end;
	}
	public String getTravel_target() {
		return travel_target;
	}
	public void setTravel_target(String travel_target) {
		this.travel_target = travel_target;
	}
	public String getTravel_result() {
		return travel_result;
	}
	public void setTravel_result(String travel_result) {
		this.travel_result = travel_result;
	}
	public int getTravel_date() {
		return travel_date;
	}
	public void setTravel_date(int travel_date) {
		this.travel_date = travel_date;
	}
	public String getTravel_remark() {
		return travel_remark;
	}
	public void setTravel_remark(String travel_remark) {
		this.travel_remark = travel_remark;
	}
	public String getReim_type() {
		return reim_type;
	}
	public void setReim_type(String reim_type) {
		this.reim_type = reim_type;
	}
	public String getStatus1_opinion() {
		return status1_opinion;
	}
	public void setStatus1_opinion(String status1_opinion) {
		this.status1_opinion = status1_opinion;
	}
	public TravelInfoVo(String travel_address, String travel_start, String travel_end, String travel_target,
			String travel_result, int travel_date, String travel_remark, String reim_type, String status1_opinion) {
		super();
		this.travel_address = travel_address;
		this.travel_start = travel_start;
		this.travel_end = travel_end;
		this.travel_target = travel_target;
		this.travel_result = travel_result;
		this.travel_date = travel_date;
		this.travel_remark = travel_remark;
		this.reim_type = reim_type;
		this.status1_opinion = status1_opinion;
	}
	public TravelInfoVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TravelInfoVo [travel_address=" + travel_address + ", travel_start=" + travel_start + ", travel_end="
				+ travel_end + ", travel_target=" + travel_target + ", travel_result=" + travel_result
				+ ", travel_date=" + travel_date + ", travel_remark=" + travel_remark + ", reim_type=" + reim_type
				+ ", status1_opinion=" + status1_opinion + "]";
	}
	
}
