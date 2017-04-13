package com.exampe.constrait;

import java.util.List;

public class Order {
	private String odderNumber;
	List<Costomer> list;

	public String getOdderNumber() {
		return odderNumber;
	}

	public void setOdderNumber(String odderNumber) {
		this.odderNumber = odderNumber;
	}

	public List<Costomer> getList() {
		return list;
	}

	public void setList(List<Costomer> list) {
		this.list = list;
	}
}
