package com.pointwest.workforce.planner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service_line")
public class ServiceLine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="service_line_id")
	private int serviceLineId;
	
	@Column(name="service_line_name")
	private String serviceLineName;

	public int getServiceLineId() {
		return serviceLineId;
	}

	public void setServiceLineId(int serviceLineId) {
		this.serviceLineId = serviceLineId;
	}

	public String getServiceLineName() {
		return serviceLineName;
	}

	public void setServiceLineName(String serviceLineName) {
		this.serviceLineName = serviceLineName;
	}
	
	
}
