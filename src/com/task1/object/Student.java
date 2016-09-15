package com.task1.object;

public class Student {
	String Stuid;
	String Stuname;
	String Stuaddress;
	public Student(String Stuid,String Stuname,String Stuaddress){
		
	}
	
	public String getStuid() {
		return Stuid;
	}
	public void setStuid(String stuid) {
		Stuid = stuid;
		
		System.out.println(""+Stuid);
	}
	public String getStuname() {
		return Stuname;
	}
	public void setStuname(String stuname) {
		Stuname = stuname;
		System.out.println(""+Stuname);
	}
	public String getStuaddress() {
		return Stuaddress;
	}
	public void setStuaddress(String stuaddress) {
		Stuaddress = stuaddress;
		System.out.println(""+Stuaddress);
	}

}
