package com.tns.daytwelve;

public class VoterInfo {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "VoterInfo [name=" + name + ", age=" + age + "]";
	}
	
	
}
