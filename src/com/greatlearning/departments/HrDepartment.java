package com.greatlearning.departments;

public class HrDepartment extends SuperDepartment {
	public HrDepartment()
	{
		System.out.println("Welcome to" + this.departmentName());
		System.out.println(this.doActivity());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(super.isTodayAHoliday()+ "\n");
	}
	
	String departmentName()
	{
		return (" Hr Department ");
	}
	
	String getTodaysWork()
	{
		return ("Fill today’s timesheet and mark your attendance");
	}
	
	String getWorkDeadline()
	{
		return ("Complete by EOD ");
	}
	
	String doActivity()
	{
		return ("team Lunch");
	}

}
