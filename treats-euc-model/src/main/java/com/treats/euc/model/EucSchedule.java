package com.treats.euc.model;

import java.time.LocalTime;

public class EucSchedule {

	private LocalTime exectueTime;
	private String executeFrequency;
	private String executeDayOfWeek;
	
	public LocalTime getExectueTime() {
		return exectueTime;
	}
	
	public void setExectueTime(LocalTime exectueTime) {
		this.exectueTime = exectueTime;
	}
	
	public String getExecuteFrequency() {
		return executeFrequency;
	}
	
	public void setExecuteFrequency(String executeFrequency) {
		this.executeFrequency = executeFrequency;
	}
	
	public String getExecuteDayOfWeek() {
		return executeDayOfWeek;
	}
	
	public void setExecuteDayOfWeek(String executeDayOfWeek) {
		this.executeDayOfWeek = executeDayOfWeek;
	}
	
}
