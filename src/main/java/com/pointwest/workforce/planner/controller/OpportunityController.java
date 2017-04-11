package com.pointwest.workforce.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pointwest.workforce.planner.domain.Opportunity;
import com.pointwest.workforce.planner.service.OpportunityService;

@RestController
public class OpportunityController {
	
	@Autowired
	OpportunityService opportunityService;
	
	@RequestMapping("/workforce/opportunities")
    public List<Opportunity> fetchAllOpportunities() {
       return opportunityService.fetchAllOpportunities();
    }
	
	@RequestMapping("/workforce/opportunities/{opportunityId}")
    public Opportunity fetchOpportunity(@PathVariable int opportunityId) {
       return opportunityService.fetchOpportunity(opportunityId);
    }
	
	@RequestMapping("/workforce/users/{username}/opportunities")
    public List<Opportunity> fetchOpportunity(@PathVariable String username) {
       return opportunityService.fetchOpportunitiesByUsername(username);
    }
	
	@RequestMapping("/workforce/users/{username}/opportunities/other")
    public List<Opportunity> fetchNotOwnedOpportunity(@PathVariable String username) {
       return opportunityService.fetchNotOwnedOpportunitiesByUsername(username);
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/workforce/opportunities")
    public ResponseEntity<Opportunity> saveOpportunity(@RequestBody(required=false) Opportunity opportunity) {
		Opportunity retrievedOpportunity = null;
		if(opportunity==null) {
			retrievedOpportunity = opportunityService.saveOpportunity(new Opportunity());
		} else {
			retrievedOpportunity = opportunityService.saveOpportunity(opportunity);
		}
		if(retrievedOpportunity==null) {
			return new ResponseEntity<>(opportunity, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<Opportunity>(retrievedOpportunity, HttpStatus.CREATED);
		}
    }
	
	/*@RequestMapping(method=RequestMethod.PUT, value="/workforce/opportunities/{opportunityId}")
    public void updateOpportunity(@PathVariable long opportunityId, Opportunity opportunity) {
	//id placed for standards/convention... you can use it to log
       opportunityService.updateOpportunity(opportunity);
    }*/
	
	@RequestMapping(method=RequestMethod.POST, value="/opportunities/{opportunityId}/lock/{lock}")
    public void updateOpportunityLock(@PathVariable long opportunityId, @PathVariable boolean lock) {
		opportunityService.lockOpportunity(opportunityId, lock);
    }

}
