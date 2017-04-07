package com.pointwest.workforce.planner.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="activity_id")
	private int activityId;
	
	@Column(name="activity_name")
	private String activityName;
	
	@Column(name="is_custom")
	private boolean isCustom;

	private Double durationInWeeks;
	
	private Double durationInMonths;
	
	private Timestamp activityStartDate;
	
	private List<ResourceSpecification> resourceSpecificationList;
	
	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public boolean isCustom() {
		return isCustom;
	}

	public void setCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}

	public Double getDurationInWeeks() {
		return durationInWeeks;
	}

	public void setDurationInWeeks(Double durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}

	public Double getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(Double durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public Timestamp getActivityStartDate() {
		return activityStartDate;
	}

	public void setActivityStartDate(Timestamp activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public List<ResourceSpecification> getResourceSpecificationList() {
		return resourceSpecificationList;
	}

	public void setResourceSpecificationList(List<ResourceSpecification> resourceSpecificationList) {
		this.resourceSpecificationList = resourceSpecificationList;
	}
	
	
}
