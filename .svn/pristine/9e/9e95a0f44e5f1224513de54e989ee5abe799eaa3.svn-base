package com.pointwest.workforce.planner.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pointwest.workforce.planner.WorkforcePlannerApplication;
import com.pointwest.workforce.planner.data.OpportunityRepository;
import com.pointwest.workforce.planner.domain.Opportunity;
import com.pointwest.workforce.planner.service.OpportunityService;
import com.pointwest.workforce.planner.service.ReferenceDataService;

@Service
public class OpportunityServiceImpl implements OpportunityService {
	
	@Autowired
	public OpportunityRepository opportunityRepository;
	
	@Autowired
	public ReferenceDataService referenceDataService;
	
	private static final Logger log = LoggerFactory.getLogger(WorkforcePlannerApplication.class);
	
	@Override
	public List<Opportunity> fetchAllOpportunities() {
		List<Opportunity> opportunities = new ArrayList<Opportunity>(); 
		opportunityRepository.findAll().forEach(opportunities::add);
//		
//		for(Opportunity opportunity : opportunities) {
//			log.debug(opportunity.getOpportunityName() + " MC: " + opportunity.getMarketCircle().getMarketCircleId());
//		}
		return opportunities;
	}
	
	@Override
	public Opportunity fetchOpportunity(long opportunityId) {
		return opportunityRepository.findOne(opportunityId);
	}
	
	@Override
	public int addOpportunity(Opportunity opportunity) {
		Opportunity saved = opportunityRepository.save(opportunity);
		return saved != null ?  1 : 0;
	}
//	
//	@Override
//	public int updateOpportunity(int opportunityId, Opportunity opportunity) {
//		Opportunity saved = opportunityRepository.save(opportunity);
//		return saved != null ?  1 : 0;
//	}
//	

}
