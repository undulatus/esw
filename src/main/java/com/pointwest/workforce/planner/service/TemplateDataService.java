package com.pointwest.workforce.planner.service;

import java.util.List;

import com.pointwest.workforce.planner.domain.Activity;
import com.pointwest.workforce.planner.domain.Practice;
import com.pointwest.workforce.planner.domain.Role;

public interface TemplateDataService {

	public List<Activity> fetchActivitiesByServiceLineId(int serviceLineId);
	
	public List<Role> fetchRolesByServiceLineId(int serviceLineId);
	
	public List<Practice> fetchPracticesByRoleId(int practice);
	
}
