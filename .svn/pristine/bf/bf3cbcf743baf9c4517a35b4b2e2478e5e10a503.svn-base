package com.pointwest.workforce.planner.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pointwest.workforce.planner.data.MarketCircleRepository;
import com.pointwest.workforce.planner.data.ServiceLineRepository;
import com.pointwest.workforce.planner.domain.MarketCircle;
import com.pointwest.workforce.planner.domain.ServiceLine;
import com.pointwest.workforce.planner.service.ReferenceDataService;

@Service
public class ReferenceDataServiceImpl implements ReferenceDataService {

		@Autowired
		public MarketCircleRepository marketCircleRepository;
		
		@Autowired
		public ServiceLineRepository serviceLineRepository;
		
		@Override
		public List<MarketCircle> fetchAllMarketCircle() {
//			List<MarketCircle> marketCircles = new ArrayList<MarketCircle>(); 
//			marketCircleRepository.findAll().forEach(marketCircles::add);
//			return marketCircles;
			return (List<MarketCircle>) marketCircleRepository.findAll();
		}
		
		@Override
		public MarketCircle fetchMarketCircle(int marketCircleId) {
			return marketCircleRepository.findOne(marketCircleId);
		}
		
		@Override
		public int addMarketCircle(MarketCircle marketCircle) {
			MarketCircle saved = marketCircleRepository.save(marketCircle);
			return saved != null ?  1 : 0;
		}
		
		@Override
		public int updateMarketCircle(int marketCircleId, MarketCircle marketCircle) {
//			MarketCircle saved = marketCircleRepository.save(marketCircleId, marketCircle);
//			return saved != null ?  1 : 0;
			return 0;
		}

		@Override
		public List<ServiceLine> fetchAllServiceLine() {
			return (List<ServiceLine>) serviceLineRepository.findAll();
		}

		@Override
		public ServiceLine fetchServiceLine(int serviceLineId) {
			// TODO Auto-generated method stub
			return serviceLineRepository.findOne(serviceLineId);
		}

		@Override
		public int addServiceLine(ServiceLine serviceLine) {
			ServiceLine saved = serviceLineRepository.save(serviceLine);
			return saved != null ?  1 : 0;
		}

		@Override
		public int updateServiceLine(int serviceLineId, ServiceLine serviceLine) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

