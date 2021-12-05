package com.greatlearning.superdepartment;

public class SuperDepartment {
	
	/*
	* declaring methods as protected,which will be used by three departments through
	* inheritance
	*/
	
	protected String departmentName()
	{
		return (" Super Department ");
	}
	
	protected String getTodaysWork()
	{
		return ("No Work as of now");
	}
	
	protected String getWorkDeadline()
	{
		return (" Nil ");
	}
	
	protected String isTodayAHoliday()
	{
		return ("Today is not a holiday");
	}
}
