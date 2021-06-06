package com.practice.samagra.businessobject;

import java.util.List;

import com.practice.samagra.entity.CourseDetail;

public interface ISwayamBusinessObject {
	
	List<CourseDetail> fetchCourseData();

	void persistCourseData(List<CourseDetail> cd);
}
