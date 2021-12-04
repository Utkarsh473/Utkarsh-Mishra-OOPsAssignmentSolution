package com.greatlearning.departments;

public class TechDepartment extends SuperDepartment {
		
		public TechDepartment() {
		System.out.println("Welcome to" + this.departmentName());
		System.out.println(this.getTodaysWork());
		System.out.println(this.getWorkDeadline());
		System.out.println(this.getTechStackInformation());
		System.out.println(super.isTodayAHoliday()+ "\n");
	}

	String departmentName()
	{
		return (" Tech Department ");
	}
	
	String getTodaysWork()
	{
		return ("Complete coding of module 1");
	}
	
	String getWorkDeadline()
	{
		return ("Complete by EOD ");
	}
	
	String getTechStackInformation()
	{
		return ("core Java");
	}
}
