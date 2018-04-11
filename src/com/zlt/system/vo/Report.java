package com.zlt.system.vo;
/**
 * 用于接收个人报表的数据，关于类型的饼状图
 * @author 晓煜
 * @date2018年1月24日下午7:07:53
 * @version
 * @explain
 */
public class Report {
	private String  type;
	private int value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Report [type=" + type + ", value=" + value + "]";
	}
	public Report(String type, int value) {
		super();
		this.type = type;
		this.value = value;
	}
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
