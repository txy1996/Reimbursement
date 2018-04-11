package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;
import com.zlt.system.annotation.Number;

/**
 * 交通报销表的实体类
 * @author 晓煜 知了堂项目Java三组
 *@date 2018年1月22日22:16:09
 *@explain 交通报销表的实体类
 */
@Bean("traffic")
public class Traffic {
	@Id("traffic_id")
	private int traffic_id;
	@Column("reim_id")
	private int reim_id;
	@Column("emp_name")
	private String emp_name;
	@Column("traffic_time")
	private Date traffic_time;
	@Column("traffic_address")
	private String traffic_address;
	@Column("traffic_start")
	private Date traffic_start;
	@Column("traffic_end")
	private Date traffic_end;
	@Column("traffic_type")
	private String traffic_type;
	@Column("traffic_money")
	private float traffic_money;
	@Column("traffic_remark")
	private String traffic_remark;
	@Column("traffic_titel")
	private String traffic_titel;
	@Column("department_name")
	private String department_name;
	@Number("app_abb")
	private String app_abb;
	public int getTraffic_id() {
		return traffic_id;
	}
	public void setTraffic_id(int traffic_id) {
		this.traffic_id = traffic_id;
	}
	public int getReim_id() {
		return reim_id;
	}
	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getTraffic_address() {
		return traffic_address;
	}
	public void setTraffic_address(String traffic_address) {
		this.traffic_address = traffic_address;
	}
	
	public Date getTraffic_start() {
		return traffic_start;
	}
	public void setTraffic_start(Date traffic_start) {
		this.traffic_start = traffic_start;
	}
	public Date getTraffic_end() {
		return traffic_end;
	}
	public void setTraffic_end(Date traffic_end) {
		this.traffic_end = traffic_end;
	}
	public String getTraffic_type() {
		return traffic_type;
	}
	public void setTraffic_type(String traffic_type) {
		this.traffic_type = traffic_type;
	}
	public float getTraffic_money() {
		return traffic_money;
	}
	public void setTraffic_money(float traffic_money) {
		this.traffic_money = traffic_money;
	}
	public String getTraffic_remark() {
		return traffic_remark;
	}
	public void setTraffic_remark(String traffic_remark) {
		this.traffic_remark = traffic_remark;
	}
	
	public Date getTraffic_time() {
		return traffic_time;
	}
	public void setTraffic_time(Date traffic_time) {
		this.traffic_time = traffic_time;
	}
	public String getTraffic_titel() {
		return traffic_titel;
	}
	public void setTraffic_titel(String traffic_titel) {
		this.traffic_titel = traffic_titel;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	@Override
	public String toString() {
		return "Traffic [traffic_id=" + traffic_id + ", reim_id=" + reim_id + ", emp_name=" + emp_name
				+ ", traffic_time=" + traffic_time + ", traffic_address=" + traffic_address + ", traffic_start="
				+ traffic_start + ", traffic_end=" + traffic_end + ", traffic_type=" + traffic_type + ", traffic_money="
				+ traffic_money + ", traffic_remark=" + traffic_remark + ", traffic_titel=" + traffic_titel
				+ ", department_name=" + department_name + ", app_abb=" + app_abb + "]";
	}
	/**
	 * 
	 * @param traffic_id  类型ID，主键,自增长
	 * @param reim_id 报销类型编号，外键
	 * @param emp_name 员工姓名，外键
	 * @param traffic_time 提交时间
	 * @param traffic_address 出发地点  
	 * @param traffic_start 出发时间
	 * @param traffic_end 到达时间
	 * @param traffic_type 交通类型
	 * @param traffic_money 费用总额
	 * @param traffic_remark 备注
	 * @param traffic_titel 报销标题
	 * @param department_name 部门名称
	 * @param mxid 报销单编号
	 */
	public Traffic(int traffic_id, int reim_id, String emp_name, Date traffic_time, String traffic_address,
			Date traffic_start, Date traffic_end, String traffic_type, float traffic_money, String traffic_remark,
			String traffic_titel, String department_name, String app_abb) {
		super();
		this.traffic_id = traffic_id;
		this.reim_id = reim_id;
		this.emp_name = emp_name;
		this.traffic_time = traffic_time;
		this.traffic_address = traffic_address;
		this.traffic_start = traffic_start;
		this.traffic_end = traffic_end;
		this.traffic_type = traffic_type;
		this.traffic_money = traffic_money;
		this.traffic_remark = traffic_remark;
		this.traffic_titel = traffic_titel;
		this.department_name = department_name;
		this.app_abb = app_abb;
	}
	public Traffic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getApp_abb() {
		return app_abb;
	}
	public void setApp_abb(String app_abb) {
		this.app_abb = app_abb;
	}
	
}
