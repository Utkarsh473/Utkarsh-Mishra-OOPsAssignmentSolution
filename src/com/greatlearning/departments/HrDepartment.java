package com.greatlearning.departments;

import com.greatlearning.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	// creating constructor of HrDepartment class which will call methods
	public HrDepartment()
	{
		System.out.println("Welcome to" + this.departmentName());
		System.out.println(this.doActivity());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday()+ "\n");
	}
	
	// Method to display department name
	public String departmentName()
	{
		return (" Hr Department ");
	}
	
	// Method to display the work assigned for today
	public String getTodaysWork()
	{
		return ("Fill today’s timesheet and mark your attendance");
	}
	
	// Method to display the deadline to complete the work
	public String getWorkDeadline()
	{
		return ("Complete by EOD ");
	}
	
	// Method to display today's activity
	public String doActivity()
	{
		return ("team Lunch");
	}

}
