package com.tns.assigment;
class name{
	
	// getter and seter methods in java
	private int age;
	private String name1;
	private long mobile_number;
	
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	
	public void setName1(String s) {
		this.name1=s;
		
	}
	public String getName1() {
		return name1;
		
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge()
	{
		return age;
	}
}

public class code1 extends name {
	public  static void main(String [] args) {
		
		name sa=new name();
		sa.setName1("Yogi");
		sa.setAge(22);
		System.out.println(sa.getName1());
		System.out.println(sa.getAge());
		
		sa.setName1("helliiii");
		System.out.println(sa.getName1());

		
		
	}
	
	
}

