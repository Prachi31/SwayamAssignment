package com.practice.samagra.service;

import java.util.List;

import com.practice.samagra.entity.CourseDetail;

public interface ISwayamService {

	void getAndPersistCourseData();

	List<CourseDetail> fetchCourseData();

}
