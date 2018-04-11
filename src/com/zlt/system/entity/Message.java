package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 消息表的实体类
 * @author 米邓勇
 *
 */
@Bean("message")
public class Message {
	@Id("message_id")
	private int message_id;
	
	@Column("emp_name1")
	private String emp_name1;
	
	@Column("emp_name2")
	private String emp_name2;
	
	@Column("message_type")
	private String message_type;
	
	@Column("message_content")
	private String message_content;

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public String getEmp_name1() {
		return emp_name1;
	}

	public void setEmp_name1(String emp_name1) {
		this.emp_name1 = emp_name1;
	}

	public String getEmp_name2() {
		return emp_name2;
	}

	public void setEmp_name2(String emp_name2) {
		this.emp_name2 = emp_name2;
	}

	public String getMessage_type() {
		return message_type;
	}

	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	@Override
	public String toString() {
		return "Message [message_id=" + message_id + ", emp_name1=" + emp_name1 + ", emp_name2=" + emp_name2
				+ ", message_type=" + message_type + ", message_content=" + message_content + "]";
	}

	public Message(int message_id, String emp_name1, String emp_name2, String message_type, String message_content) {
		super();
		this.message_id = message_id;
		this.emp_name1 = emp_name1;
		this.emp_name2 = emp_name2;
		this.message_type = message_type;
		this.message_content = message_content;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
