package com.sample;

import java.util.Map;

public class Student {
    private   String sex ;
	private  String name ;
    private   int age ;
	private School school;
	private Map<String,School> map;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Map<String, School> getMap() {
		return map;
	}
	public void setMap(Map<String, School> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Student [sex=" + sex + ", name=" + name + ", age=" + age
				+ ", school=" + school + ", map=" + map + "]";
	}
	
	
}
