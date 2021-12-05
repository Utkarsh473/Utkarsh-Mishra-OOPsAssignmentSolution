package com.greatlearning.departments;

import com.greatlearning.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
		
	// creating constructor of TechDepartment class which will call methods
	public TechDepartment() 
	{
		System.out.println("Welcome to" + this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(this.getTechStackInformation());
		System.out.println(super.isTodayAHoliday()+ "\n");
	}

	// Method to display department name
	public String departmentName()
	{
		return (" Tech Department ");
	}
	
	// Method to display the work assigned for today
	public String getTodaysWork()
	{
		return ("Complete coding of module 1");
	}
	
	// Method to display the deadline to complete the work
	public String getWorkDeadline()
	{
		return ("Complete by EOD ");
	}
	
	// Method to display the Tech stack
	public String getTechStackInformation()
	{
		return ("core Java");
	}
}
