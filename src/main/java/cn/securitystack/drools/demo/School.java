package cn.securitystack.drools.demo;

public class School {
	public School() {
	}

	public School(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	private String name;
	private String addr;

	@Override
	public String toString() {
		return "School [name=" + name + ", addr=" + addr + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
