package org.fullyabstraction;

public class Company implements Employee {
	public void empName() {
		System.out.println("empNme is xhsgjsjgb");
	}
	public void  empPhone()
	{
		System.out.println("employee phone no is 9648656e9");
	}
	public void empAddress()
	{
		System.out.println("employee address is salem");
	}
 public static void main(String[] args) {
	Company com=new Company();
	com.empName();
	com.empPhone();
	com.empAddress();
}
}
