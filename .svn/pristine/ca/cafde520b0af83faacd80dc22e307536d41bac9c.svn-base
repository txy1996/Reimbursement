package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;
import com.zlt.system.annotation.Number;

/**
 * 差旅表的实体类
 * @author 晓煜  知了堂项目Java三组
 *@date 2018年1月22日21:57:29
 *@explain 差旅表的实体类
 */
@Bean("travel")
public class Travel {
	@Id("travel_id")
	private int travel_id;
	@Column("reim_id")
	private int reim_id;
	@Column("emp_name")
	private String emp_name;
	@Column("travel_time")
	private Date travel_time;
	@Column("travel_address")
	private String travel_address;
	@Column("travel_start")
	private Date travel_start;
	@Column("travel_end")
	private Date travel_end;
	@Column("travel_target")
	private String travel_target;
	@Column("travel_result")
	private String travel_result;
	@Column("travel_date")
	private  int travel_date;
	@Column("travel_remark")
	private String travel_remark;
	@Column("travel_money")
	private float travel_money;
	@Column("travel_title")
	private String travel_title;
	@Column("department_name")
	private String department_name;
	@Number("app_abb")
	private String app_abb;
	public int getTravel_id() {
		return travel_id;
	}
	public void setTravel_id(int travel_id) {
		this.travel_id = travel_id;
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
	public String getTravel_address() {
		return travel_address;
	}
	public void setTravel_address(String travel_address) {
		this.travel_address = travel_address;
	}
	
	public Date getTravel_start() {
		return travel_start;
	}
	public void setTravel_start(Date travel_start) {
		this.travel_start = travel_start;
	}
	public Date getTravel_end() {
		return travel_end;
	}
	public void setTravel_end(Date travel_end) {
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
	public float getTravel_money() {
		return travel_money;
	}
	public void setTravel_money(float travel_money) {
		this.travel_money = travel_money;
	}
	public Date getTravel_time() {
		return travel_time;
	}
	public void setTravel_time(Date travel_time) {
		this.travel_time = travel_time;
	}
	public String getTravel_title() {
		return travel_title;
	}
	public void setTravel_title(String travel_title) {
		this.travel_title = travel_title;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
	public String getApp_abb() {
		return app_abb;
	}
	public void setApp_abb(String app_abb) {
		this.app_abb = app_abb;
	}
	@Override
	public String toString() {
		return "Travel [travel_id=" + travel_id + ", reim_id=" + reim_id + ", emp_name=" + emp_name + ", travel_time="
				+ travel_time + ", travel_address=" + travel_address + ", travel_start=" + travel_start
				+ ", travel_end=" + travel_end + ", travel_target=" + travel_target + ", travel_result=" + travel_result
				+ ", travel_date=" + travel_date + ", travel_remark=" + travel_remark + ", travel_money=" + travel_money
				+ ", travel_title=" + travel_title + ", department_name=" + department_name + ", app_abb=" + app_abb + "]";
	}
	/**
	 * 
	 * @param travel_id 类型ID，主键,自增长
	 * @param reim_id 报销类型编号，外键
	 * @param emp_name  员工工号，外键
	 * @param travel_time 报销提交日期
	 * @param travel_address  出差地
	 * @param travel_start  出差开始时间
	 * @param travel_end 出差结束时间
	 * @param travel_target  预期工作目标
	 * @param travel_result 后续安排
	 * @param travel_date  合计天数
	 * @param travel_remark 备注
	 * @param travel_money 费用总额
	 * @param travel_title 标题名称
	 * @param department_name部门名称
	 * @param app_abb 报销单编号
	 */
	public Travel(int travel_id, int reim_id, String emp_name, Date travel_time, String travel_address,
			Date travel_start, Date travel_end, String travel_target, String travel_result, int travel_date,
			String travel_remark, float travel_money, String travel_title, String department_name, String app_abb) {
		super();
		this.travel_id = travel_id;
		this.reim_id = reim_id;
		this.emp_name = emp_name;
		this.travel_time = travel_time;
		this.travel_address = travel_address;
		this.travel_start = travel_start;
		this.travel_end = travel_end;
		this.travel_target = travel_target;
		this.travel_result = travel_result;
		this.travel_date = travel_date;
		this.travel_remark = travel_remark;
		this.travel_money = travel_money;
		this.travel_title = travel_title;
		this.department_name = department_name;
		this.app_abb = app_abb;
	}
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
