package com.practice.samagra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_DETAIL")
public class CourseDetail {
	@Id
    private Long entityId;
	private String title;
	private String url;
	private String explorerInstructorName;
	private Boolean openForRegistration;
	private int credits;
	private int weeks;
	private String instructorInstitute;
	private String ncCode;
	
	
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
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

	public Boolean getOpenForRegistration() {
		return openForRegistration;
	}
	public void setOpenForRegistration(Boolean openForRegistration) {
		this.openForRegistration = openForRegistration;
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
	public String getExplorerInstructorName() {
		return explorerInstructorName;
	}
	public void setExplorerInstructorName(String explorerInstructorName) {
		this.explorerInstructorName = explorerInstructorName;
	}
	
}