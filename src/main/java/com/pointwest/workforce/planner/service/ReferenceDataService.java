package com.pointwest.workforce.planner.service;

import java.util.List;

import com.pointwest.workforce.planner.domain.MarketCircle;
import com.pointwest.workforce.planner.domain.ServiceLine;

public interface ReferenceDataService {

	public List<MarketCircle> fetchAllMarketCircle();

	public MarketCircle fetchMarketCircle(int marketCircleId);

	public int addMarketCircle(MarketCircle marketCircle);

	public int updateMarketCircle(int marketCircleId, MarketCircle marketCircle);
	
	public List<ServiceLine> fetchAllServiceLine();

	public ServiceLine fetchServiceLine(int serviceLineId);

	public int addServiceLine(ServiceLine serviceLine);

	public int updateServiceLine(int serviceLineId, ServiceLine serviceLine);

}
