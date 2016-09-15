package com.task1.object;

public class Employee {
	String Empid;
	String Empname;
	String Empaddress;
public Employee(String Empid,String Empname,String Empaddress){
		
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
		System.out.println(""+Empid);
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
		System.out.println(""+Empname);
	}
	public String getEmpaddress() {
		return Empaddress;
	}
	public void setEmpaddress(String empaddress) {
		Empaddress = empaddress;
		System.out.println(""+Empaddress);
	}
}
