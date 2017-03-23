package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarketCircle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="market_cicle_id")
	private int marketCircleId;
	
	@Column(name="market_circle_name")
	private String marketCircleName;

	public int getMarketCircleId() {
		return marketCircleId;
	}

	public void setMarketCircleId(int marketCircleId) {
		this.marketCircleId = marketCircleId;
	}

	public String getMarketCircleName() {
		return marketCircleName;
	}

	public void setMarketCircleName(String marketCircleName) {
		this.marketCircleName = marketCircleName;
	}
	
}
