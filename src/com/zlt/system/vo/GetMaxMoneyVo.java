package com.zlt.system.vo;

public class GetMaxMoneyVo {
	public String money;

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "GetMaxMoneyVo [money=" + money + "]";
	}

	public GetMaxMoneyVo(String money) {
		super();
		this.money = money;
	}

	public GetMaxMoneyVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
