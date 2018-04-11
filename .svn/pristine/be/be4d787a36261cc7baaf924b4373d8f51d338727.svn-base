package com.zlt.system.entity;

import com.zlt.system.annotation.Bean;
import com.zlt.system.annotation.Column;
import com.zlt.system.annotation.Id;

/**
 * 报销级别表的实体类
 * @author 米邓勇
 *
 */
@Bean("level")
public class Level {
	@Id("level_id")
	private int level_id;
	
	@Column("position_level")
	private int position_level;
	
	@Column("level_money")
	private String level_money;

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	public int getPosition_level() {
		return position_level;
	}

	public void setPosition_level(int position_level) {
		this.position_level = position_level;
	}

	public String getLevel_money() {
		return level_money;
	}

	public void setLevel_money(String level_money) {
		this.level_money = level_money;
	}

	@Override
	public String toString() {
		return "Level [level_id=" + level_id + ", position_level=" + position_level + ", level_money=" + level_money
				+ "]";
	}

	public Level(int level_id, int position_level, String level_money) {
		super();
		this.level_id = level_id;
		this.position_level = position_level;
		this.level_money = level_money;
	}

	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
