package com.bugtrack3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long projId;
	
	private String projTitle;
	private String projDescription;
	
	public ProjectEntity() {
		
	}
	
	
	public ProjectEntity(String projTitle, String projDescription) {
		super();
		this.projTitle = projTitle;
		this.projDescription = projDescription;
	}
	
	public Long getProjId() {
		return projId;
	}
	public void setProjId(Long projId) {
		this.projId = projId;
	}
	public String getProjTitle() {
		return projTitle;
	}
	public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
	}
	public String getProjDescription() {
		return projDescription;
	}
	public void setProjDescription(String projDescription) {
		this.projDescription = projDescription;
	}
	
	
	
}
