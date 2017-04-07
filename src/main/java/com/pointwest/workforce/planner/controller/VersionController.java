package com.pointwest.workforce.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pointwest.workforce.planner.domain.Role;
import com.pointwest.workforce.planner.service.ReferenceDataService;
import com.pointwest.workforce.planner.service.TemplateDataService;

@RestController
public class VersionController {
	
	/*@Autowired
	ReferenceDataService referenceDataService;
	
	@Autowired
	TemplateDataService templateDataService;
	
	@Autowired
	JsonParser parser;
	
	@RequestMapping("/workforce/roles")
    public List<Role> fetchAllRole() {
       return referenceDataService.fetchAllRole();
    }
	
	@RequestMapping("/workforce/roles/{roleId}")
    public Role fetchRole(@PathVariable int roleId) {
		
		//Map<String,Object> resMap = this.parser.parseMap(EntityUtils.toString(response.getEntity()));
       return referenceDataService.fetchRole(roleId);
    }
	
	@RequestMapping("/workforce/servicelines/{serviceLineId}/roles")
    public List<Role> fetchRolesByServiceLineId(@PathVariable int serviceLineId) {
       return templateDataService.fetchRolesByServiceLineId(serviceLineId);
    }*/

}
