package com.zlt.system.entity;

import java.util.Date;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;
import com.zlt.system.annotation.Number;

/**
 * 住宿报销的实体类
 * @author 晓煜 知了堂项目Java三组
 *@date 2018年1月22日22:23:43
 *@explain 住宿报销的实体类
 */
@Bean("hotel")
public class Hotel {
	@Id("hotel_id")
	private int hotel_id;
	@Column("reim_id")
	private int reim_id;
	@Column("emp_name")
	private String emp_name;
	@Column("hotel_time")
	private Date hotel_time;
	@Column("hotel_first")
	private Date hotel_first;
	@Column("hotel_title")
	private String hotel_title;
	@Column("department_name")
	private String department_name;
	@Number("app_abb")
	private String app_abb;
	public Date getHotel_time() {
		return hotel_time;
	}
	public void setHotel_time(Date hotel_time) {
		this.hotel_time = hotel_time;
	}
	@Column("hotel_finish")
	private Date hotel_finish;
	@Column("hotel_site")
	private String hotel_site;
	@Column("hotel_days")
	private int hotel_days;
	@Column("hotel_people")
	private String hotel_people;
	@Column("hotel_other")
	private String hotel_Other;
	@Column("hotel_quarterage")
	private float hotel_quarterage;
	@Column("hotel_remarks")
	private String hotel_remarks;
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
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

	public Date getHotel_first() {
		return hotel_first;
	}
	public void setHotel_first(Date hotel_first) {
		this.hotel_first = hotel_first;
	}
	public Date getHotel_finish() {
		return hotel_finish;
	}
	public void setHotel_finish(Date hotel_finish) {
		this.hotel_finish = hotel_finish;
	}
	public String getHotel_site() {
		return hotel_site;
	}
	public void setHotel_site(String hotel_site) {
		this.hotel_site = hotel_site;
	}
	public int getHotel_days() {
		return hotel_days;
	}
	public void setHotel_days(int hotel_days) {
		this.hotel_days = hotel_days;
	}
	public String getHotel_people() {
		return hotel_people;
	}
	public void setHotel_people(String hotel_people) {
		this.hotel_people = hotel_people;
	}
	public String getHotel_Other() {
		return hotel_Other;
	}
	public void setHotel_Other(String hotel_Other) {
		this.hotel_Other = hotel_Other;
	}
	
	public String getHotel_remarks() {
		return hotel_remarks;
	}
	public void setHotel_remarks(String hotel_remarks) {
		this.hotel_remarks = hotel_remarks;
	}
	
	public String getHotel_title() {
		return hotel_title;
	}
	public void setHotel_title(String hotel_title) {
		this.hotel_title = hotel_title;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", reim_id=" + reim_id + ", emp_name=" + emp_name + ", hotel_time="
				+ hotel_time + ", hotel_first=" + hotel_first + ", hotel_title=" + hotel_title + ", department_name="
				+ department_name + ", app_abb=" + app_abb + ", hotel_finish=" + hotel_finish + ", hotel_site=" + hotel_site
				+ ", hotel_days=" + hotel_days + ", hotel_people=" + hotel_people + ", hotel_Other=" + hotel_Other
				+ ", hotel_quarterage=" + hotel_quarterage + ", hotel_remarks=" + hotel_remarks + "]";
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param hotel_id 类型ID，主键,自增长
	 * @param reim_id 报销类型编号，外键
	 * @param emp_name 员工姓名，外键
	 * @param hotel_time 提交日期
	 * @param hotel_first 起始日期
	 * @param hotel_title 报销标题
	 * @param department_name 部门名称
	 * @param mxid 报销单编号
	 * @param hotel_finish  结束日期
	 * @param hotel_site  地点
	 * @param hotel_days 天数
	 * @param hotel_people 是否多人
	 * @param hotel_Other  其他人员
	 * @param hotel_quarterage  住宿总金额 
	 * @param hotel_remarks 备注
	 */
	public Hotel(int hotel_id, int reim_id, String emp_name, Date hotel_time, Date hotel_first, String hotel_title,
			String department_name, String app_abb, Date hotel_finish, String hotel_site, int hotel_days,
			String hotel_people, String hotel_Other, float hotel_quarterage, String hotel_remarks) {
		super();
		this.hotel_id = hotel_id;
		this.reim_id = reim_id;
		this.emp_name = emp_name;
		this.hotel_time = hotel_time;
		this.hotel_first = hotel_first;
		this.hotel_title = hotel_title;
		this.department_name = department_name;
		this.app_abb = app_abb;
		this.hotel_finish = hotel_finish;
		this.hotel_site = hotel_site;
		this.hotel_days = hotel_days;
		this.hotel_people = hotel_people;
		this.hotel_Other = hotel_Other;
		this.hotel_quarterage = hotel_quarterage;
		this.hotel_remarks = hotel_remarks;
	}
	public String getApp_abb() {
		return app_abb;
	}
	public void setApp_abb(String app_abb) {
		this.app_abb = app_abb;
	}
	public float getHotel_quarterage() {
		return hotel_quarterage;
	}
	public void setHotel_quarterage(float hotel_quarterage) {
		this.hotel_quarterage = hotel_quarterage;
	}
	
	
} 
