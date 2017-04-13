package com.exampe.constrait;

public class Costomer {

	private int age;
	private String name;
	private String goodName;
	private String goodPrice;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getGoodPrice() {
		return goodPrice;
	}

	public void setGoodPrice(String goodPrice) {
		this.goodPrice = goodPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age
				+ ((goodName == null) ? 0 : goodName.hashCode())
				+ ((goodPrice == null) ? 0 : goodPrice.hashCode())
				+ ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Costomer other = (Costomer) obj;
		if (age != other.age)
			return false;
		if (goodName == null) {
			if (other.goodName != null)
				return false;
		} else if (!goodName.equals(other.goodName))
			return false;
		if (goodPrice == null) {
			if (other.goodPrice != null)
				return false;
		} else if (!goodPrice.equals(other.goodPrice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
