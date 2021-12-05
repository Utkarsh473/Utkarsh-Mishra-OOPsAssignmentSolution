package com.greatlearning.departments;

import com.greatlearning.superdepartment.*;

public class AdminDepartment extends SuperDepartment {
	
	// creating constructor of AdminDepartment class which will call methods
	public AdminDepartment()
	{
		System.out.println("Welcome to" + this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday()+ "\n");
	}
	
	// Method to display department name
	public String departmentName()
	{
		return (" Admin Department ");
	}
	
	// Method to display the work assigned for today
	public String getTodaysWork()
	{
		return ("Complete your documents Submission");
	}
	
	// Method to display the deadline to complete the work
	public String getWorkDeadline()
	{
		return ("Complete by EOD ");
	}
	

}
