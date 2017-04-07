package com.pointwest.workforce.planner.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pointwest.workforce.planner.domain.MarketCircle;
import com.pointwest.workforce.planner.domain.Opportunity;

@RestController
public class EmployeeController {
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	private List<Opportunity> myMockList;
	private List<Opportunity> opportunityList;
	
	public List<Opportunity> getMyMockList() {
		myMockList = new ArrayList<Opportunity>();
		Opportunity op = new Opportunity();
		MarketCircle mc = new MarketCircle();
		mc.setMarketCircleName("HealthCare");
		op.setOpportunityName("Undying");
		op.setDocumentStatus("Active");
		op.setMarketCircle(mc);
		java.util.Date today = new java.util.Date();
		Timestamp timestamp = new Timestamp(today.getTime());
		op.setProjectStartDate(timestamp);
/*		op.setMarketCircle("HealthCare");
		op.setProjectId(1);
		op.setModifiedDate("07/11/2017");
		op.setCreatorId(1);
		op.setProjectName("Centaur Warrunner");
		op.setStatus("Active");*/
		myMockList.add(op);
		
		Opportunity op1 = new Opportunity();
		MarketCircle mc1 = new MarketCircle();
		mc1.setMarketCircleName("HealthCare");
		op1.setMarketCircle(mc1);
		op1.setOpportunityName("Invoker");
		op1.setDocumentStatus("Inactive");
		op1.setProjectStartDate(timestamp);
/*		op1.setMarketCircle("HealthCare");
		op1.setProjectId(2);
		op1.setModifiedDate("07/12/2017");
		op1.setCreatorId(1);
		op1.setProjectName("Spirit Breaker");
		op1.setStatus("Active");*/
		myMockList.add(op1);
		
		Opportunity op2 = new Opportunity();
		MarketCircle mc2 = new MarketCircle();
		mc2.setMarketCircleName("HealthCare");
		op2.setMarketCircle(mc2);
		op2.setOpportunityName("TerrorBlade");
		op2.setDocumentStatus("Inactive");
		op2.setProjectStartDate(timestamp);
/*		op2.setMarketCircle("BR");
		op2.setProjectId(3);
		op2.setModifiedDate("07/11/2017");
		op2.setCreatorId(1);
		op2.setProjectName("Earth Shaker");
		op2.setStatus("Active");*/
		myMockList.add(op2);
		
		return myMockList;
	}

	public List<Opportunity> getOpportunityList() {
		opportunityList = new ArrayList<Opportunity>();
		Opportunity op = new Opportunity();
		MarketCircle mc = new MarketCircle();
		mc.setMarketCircleName("HealthCare");
		op.setMarketCircle(mc);
/*		op.setMarketCircle("HealthCare");
		op.setProjectId(4);
		op.setModifiedDate("07/11/2017");
		op.setCreatorId(2);
		op.setProjectName("SLardar");
		op.setStatus("Active");*/
		opportunityList.add(op);
		
		Opportunity op1 = new Opportunity();
		MarketCircle mc1 = new MarketCircle();
		mc1.setMarketCircleName("HealthCare");
		op1.setMarketCircle(mc1);
/*		op1.setMarketCircle("HealthCare");
		op1.setProjectId(5);
		op1.setModifiedDate("07/12/2017");
		op1.setCreatorId(6);
		op1.setProjectName("Invoker");
		op1.setStatus("Active");*/
		opportunityList.add(op1);
		
		Opportunity op2 = new Opportunity();
		MarketCircle mc2 = new MarketCircle();
		mc2.setMarketCircleName("T&L");
		op2.setMarketCircle(mc2);
/*		op2.setMarketCircle("BR");
		op2.setProjectId(6);
		op2.setModifiedDate("07/11/2017");
		op2.setCreatorId(3);
		op2.setProjectName("Keeper of the Light");
		op2.setStatus("Active");*/
		opportunityList.add(op2);
		
		Opportunity op3 = new Opportunity();
		MarketCircle mc3 = new MarketCircle();
		mc3.setMarketCircleName("HealthCare");
		op3.setMarketCircle(mc3);
/*		op3.setMarketCircle("HealthCare");
		op3.setProjectId(7);
		op3.setModifiedDate("07/11/2017");
		op3.setCreatorId(2);
		op3.setProjectName("Sand King");
		op3.setStatus("Active");*/
		opportunityList.add(op3);
		
		Opportunity op4 = new Opportunity();
		MarketCircle mc4 = new MarketCircle();
		mc4.setMarketCircleName("UMP");
		op4.setMarketCircle(mc4);
/*		op4.setMarketCircle("HealthCare");
		op4.setProjectId(8);
		op4.setModifiedDate("07/12/2017");
		op4.setCreatorId(2);
		op4.setProjectName("Wind Runner");
		op4.setStatus("Active");*/
		opportunityList.add(op4);
		
		Opportunity op5 = new Opportunity();
		MarketCircle mc5 = new MarketCircle();
		mc5.setMarketCircleName("BR");
		op5.setMarketCircle(mc5);
/*		op5.setMarketCircle("BR");
		op5.setProjectId(9);
		op5.setModifiedDate("07/11/2017");
		op5.setCreatorId(4);
		op5.setProjectName("Crystal Maiden");
		op5.setStatus("Inactive");*/
		opportunityList.add(op5);
		return opportunityList;
	}
	
	
	
	@RequestMapping("/workforce/opportunities/other/{id}")
	public List<Opportunity> fetchOtherOpportunityList(@PathVariable("id")int creatorId){
		log.debug("other list");
		for(Opportunity op: getOpportunityList()){
			log.debug("other opportunity is: " + op.toString());
		}
		return getOpportunityList();
	}
	
	@RequestMapping("/workforce/opportunities/{id}")
	public List<Opportunity> fetchMyOpportunityList(@PathVariable("id")int creatorId){
		log.debug("list");
		for(Opportunity op: getMyMockList()){
			log.debug("my opportunity is: " + op.toString());
		}
		return getMyMockList();
	}
	


	
}
