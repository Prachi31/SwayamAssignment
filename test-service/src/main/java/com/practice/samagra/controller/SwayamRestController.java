package com.practice.samagra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.samagra.entity.CourseDetail;
import com.practice.samagra.service.ISwayamService;

@RestController
public class SwayamRestController {
	
	@Autowired
	public ISwayamService swayamService; 
	
	@PostMapping("/getAndPersistCourseData")  
	public void getAndPersistCourseData() {
		swayamService.getAndPersistCourseData();
	}
	
	@PostMapping("/fetchCourseData")  
	public List<CourseDetail> fetchCourseData() {
		return swayamService.fetchCourseData();
	}

}
