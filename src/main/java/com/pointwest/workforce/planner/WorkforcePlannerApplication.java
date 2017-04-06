package com.pointwest.workforce.planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:db-values.properties")
@SpringBootApplication
public class WorkforcePlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkforcePlannerApplication.class, args);
	}
}
