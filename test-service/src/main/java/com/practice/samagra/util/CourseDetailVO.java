package com.practice.samagra.util;

import java.sql.Date;
import java.util.List;

public class CourseDetailVO {
	
	private String title;
	private String url;
	private String instructorName;
	private Boolean openForRegistration;
	private Date startDate;
	private Date endDate;
	private Date enrollmentEndDate;
	private int credits;
	private int weeks;
	private String instructorInstitute;
	private String ncCode;
	private List<String> categories;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public Boolean getOpenForRegistration() {
		return openForRegistration;
	}
	public void setOpenForRegistration(Boolean openForRegistration) {
		this.openForRegistration = openForRegistration;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEnrollmentEndDate() {
		return enrollmentEndDate;
	}
	public void setEnrollmentEndDate(Date enrollmentEndDate) {
		this.enrollmentEndDate = enrollmentEndDate;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getWeeks() {
		return weeks;
	}
	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}
	public String getInstructorInstitute() {
		return instructorInstitute;
	}
	public void setInstructorInstitute(String instructorInstitute) {
		this.instructorInstitute = instructorInstitute;
	}
	public String getNcCode() {
		return ncCode;
	}
	public void setNcCode(String ncCode) {
		this.ncCode = ncCode;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	
}
