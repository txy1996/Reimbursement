package com.zlt.system.vo;
/**
 * 住宿补助详情查询
 * @author 任义平
 *
 */
public class HotelInfoVo {
	private String hotel_site;
	private String hotel_first;
	private String hotel_finish;
	private int hotel_days;
	private String hotel_people;
	private String hotel_other;
	private String hotel_remarks;
	private int hotel_quarterahe;
	private String status1_opinion;
	public String getStatus1_opinion() {
		return status1_opinion;
	}
	public void setStatus1_opinion(String status1_opinion) {
		this.status1_opinion = status1_opinion;
	}
	public String getHotel_site() {
		return hotel_site;
	}
	public void setHotel_site(String hotel_site) {
		this.hotel_site = hotel_site;
	}
	public String getHotel_first() {
		return hotel_first;
	}
	public void setHotel_first(String hotel_first) {
		this.hotel_first = hotel_first;
	}
	public String getHotel_finish() {
		return hotel_finish;
	}
	public void setHotel_finish(String hotel_finish) {
		this.hotel_finish = hotel_finish;
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
	public String getHotel_other() {
		return hotel_other;
	}
	public void setHotel_other(String hotel_other) {
		this.hotel_other = hotel_other;
	}
	public String getHotel_remarks() {
		return hotel_remarks;
	}
	public void setHotel_remarks(String hotel_remarks) {
		this.hotel_remarks = hotel_remarks;
	}
	public int getHotel_quarterahe() {
		return hotel_quarterahe;
	}
	public void setHotel_quarterahe(int hotel_quarterahe) {
		this.hotel_quarterahe = hotel_quarterahe;
	}
	public HotelInfoVo(String hotel_site, String hotel_first, String hotel_finish, int hotel_days, String hotel_people,
			String hotel_other, String hotel_remarks, int hotel_quarterahe, String status1_opinion) {
		super();
		this.hotel_site = hotel_site;
		this.hotel_first = hotel_first;
		this.hotel_finish = hotel_finish;
		this.hotel_days = hotel_days;
		this.hotel_people = hotel_people;
		this.hotel_other = hotel_other;
		this.hotel_remarks = hotel_remarks;
		this.hotel_quarterahe = hotel_quarterahe;
		this.status1_opinion = status1_opinion;
	}
	public HotelInfoVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HotelInfoVo [hotel_site=" + hotel_site + ", hotel_first=" + hotel_first + ", hotel_finish="
				+ hotel_finish + ", hotel_days=" + hotel_days + ", hotel_people=" + hotel_people + ", hotel_other="
				+ hotel_other + ", hotel_remarks=" + hotel_remarks + ", hotel_quarterahe=" + hotel_quarterahe
				+ ", status1_opinion=" + status1_opinion + "]";
	}
	
	
}
