package com.practice.samagra.util;

public class ServiceConstants {
	
	public ServiceConstants() {	}
	
	public static String SWAYAM_COURSE_FETCH_URL="https://swayam.gov.in/modules/gql/query?q=";
	public static String SWAYAM_COURSE_FETCH_URL_PARAMS_EXTRA = "{courseList(args: {includeClosed: false, status: \"Upcoming\", duration: \"all\","
			+ " examDate: \"all\", credits: \"all\", ncCode: \"all\"   }) {edges {node {  id, title, url, explorerSummary,  explorerInstructorName, "
			+ "enrollment {enrolled},   openForRegistration, startDate, endDate, examDate, enrollmentEndDate, category "
			+ "{name, category, parentId},  tags {name}, featured, coursePictureUrl, credits, weeks, nodeCode, instructorInstitute, ncCode}}}}";
	
	public static String SWAYAM_COURSE_FETCH_URL_PARAMS = "{courseList(args: {includeClosed: false, status: \"Upcoming\", duration: \"all\","
			+ " examDate: \"all\", credits: \"all\", ncCode: \"all\"   }) {edges {node {  id, title, url, explorerInstructorName, "
			+ "enrollment {enrolled},   openForRegistration, startDate, endDate, examDate, enrollmentEndDate, credits, weeks, nodeCode, instructorInstitute, ncCode}}}}";

	public static String XPATH_STR ="/html/body"; 
}
