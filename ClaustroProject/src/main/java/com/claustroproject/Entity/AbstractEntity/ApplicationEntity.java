package com.claustroproject.Entity.AbstractEntity;

import com.claustroproject.Entity.ApplicationContent;

public class ApplicationEntity<Content extends ApplicationContent> {

	private String applicationId;
	
	private String userId;
	
	private Content applicationContent;

	public Content getApplicationContent() {
		return applicationContent;
	}

	public void setApplicationContent(Content applicationContent) {
		this.applicationContent = applicationContent;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
