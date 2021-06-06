package com.practice.samagra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.samagra.service.SwayamServiceFactory;

@SpringBootApplication
public class TestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		SwayamServiceFactory.getSwayamService().getAndPersistCourseData();
	}

}
