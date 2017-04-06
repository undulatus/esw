package com.pointwest.workforce.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pointwest.workforce.planner.domain.Activity;
import com.pointwest.workforce.planner.domain.ServiceLine;
import com.pointwest.workforce.planner.service.ReferenceDataService;
import com.pointwest.workforce.planner.service.TemplateDataService;

@RestController
public class ActivityController {
	
	@Autowired
	ReferenceDataService referenceDataService;
	
	@Autowired
	TemplateDataService templateDataService;
	
	@RequestMapping("/workforce/activities")
    public List<Activity> fetchAllActivity() {
       return referenceDataService.fetchAllActivity();
    }
	
	@RequestMapping("/workforce/activities/{activityId}")
    public Activity fetchActivity(@PathVariable int activityId) {
       return referenceDataService.fetchActivity(activityId);
    }
	
	@RequestMapping("/workforce/servicelines/{serviceLineId}/activities")
    public List<Activity> fetchActivitiesByServiceLineId(@PathVariable int serviceLineId) {
       return templateDataService.fetchActivitiesByServiceLineId(serviceLineId);
    }

}
