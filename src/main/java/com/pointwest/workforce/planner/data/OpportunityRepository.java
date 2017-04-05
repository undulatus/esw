package com.pointwest.workforce.planner.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pointwest.workforce.planner.domain.Activity;
import com.pointwest.workforce.planner.domain.Opportunity;

public interface OpportunityRepository extends CrudRepository<Opportunity, Long> {

	@Query(value= 
			" SELECT opportunity_id," +
			" opportunity_name," +
			" opportunity_project_alias," +
			" market_circle_id," +
			" service_line_id," +
			" opportunity_start_date," +
			" opportunity_duration_granularity," +
			" opportunity_duration_week," +
			" opportunity_status," +
			" opportunity_client_name," +
			" opportunity_creator_username," +
			" opportunity_document_status" +
			" FROM opportunity"
			, nativeQuery=true)
	public List<Opportunity> findOpportunityList();
	
}
