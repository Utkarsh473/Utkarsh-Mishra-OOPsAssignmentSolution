package com.greatlearning.departments;

public class AdminDepartment extends SuperDepartment {
	public AdminDepartment()
	{
		System.out.println("Welcome to" + this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday()+ "\n");
	}
	
	String departmentName()
	{
		return (" Admin Department ");
	}
	
	String getTodaysWork()
	{
		return ("Complete your documents Submission");
	}
	
	String getWorkDeadline()
	{
		return ("Complete by EOD ");
	}
	

}
