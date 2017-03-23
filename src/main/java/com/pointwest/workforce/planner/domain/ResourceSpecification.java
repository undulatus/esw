package com.pointwest.workforce.planner.domain;

import java.util.Map;

public class ResourceSpecification {
	
	private int resourceSpecificationId;
	
	private Role role;
	
	private Practice practice;
	
	private PayLevel payLevel;
	
	private boolean isBillable;
	
	private Map<Integer,Double> WeeklyFTE;

	public int getResourceSpecificationId() {
		return resourceSpecificationId;
	}

	public void setResourceSpecificationId(int resourceSpecificationId) {
		this.resourceSpecificationId = resourceSpecificationId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Practice getPractice() {
		return practice;
	}

	public void setPractice(Practice practice) {
		this.practice = practice;
	}

	public PayLevel getPayLevel() {
		return payLevel;
	}

	public void setPayLevel(PayLevel payLevel) {
		this.payLevel = payLevel;
	}

	public boolean isBillable() {
		return isBillable;
	}

	public void setBillable(boolean isBillable) {
		this.isBillable = isBillable;
	}

	public Map<Integer, Double> getWeeklyFTE() {
		return WeeklyFTE;
	}

	public void setWeeklyFTE(Map<Integer, Double> weeklyFTE) {
		WeeklyFTE = weeklyFTE;
	}
	
	
}
