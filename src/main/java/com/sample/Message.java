package com.sample;

public class Message {
	// 常量 HELLO 值0
	public static final int HELLO = 0;
	// 常量 GOODBYE 值0
	public static final int GOODBYE = 1;
	public static final int MESSGE_AGE = 10;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getHello() {
		return HELLO;
	}
	public static int getGoodbye() {
		return GOODBYE;
	}
	public static int getMessgeAge() {
		return MESSGE_AGE;
	}
	// 消息
	private String message;
	// 状态
	private int status;
	private int age;

	
}
