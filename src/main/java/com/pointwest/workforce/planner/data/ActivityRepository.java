package com.pointwest.workforce.planner.data;

import org.springframework.data.repository.CrudRepository;

import com.pointwest.workforce.planner.domain.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {

}
