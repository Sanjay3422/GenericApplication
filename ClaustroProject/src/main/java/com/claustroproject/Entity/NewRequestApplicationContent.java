package com.claustroproject.Entity;

public class NewRequestApplicationContent extends ApplicationContent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	/** Domestic work, plumbing, electricity */
	private String workType;
	
	private Integer searchRadius;
	
	private boolean isUrgent;
	
	private Integer severity;
	
	private boolean verifiedProfessionals;
	
	private Integer expectedRatingRange;
	
	/** like no priority, experienced */
	private Integer professionalExperience;
	
	private String visitingOravailableTime;
	
	/** mention the additional info about the extent of the damage or amount of work to be done */ 
	private String additionalMessage;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getSearchRadius() {
		return searchRadius;
	}

	public void setSearchRadius(Integer searchRadius) {
		this.searchRadius = searchRadius;
	}

	public String getAdditionalMessage() {
		return additionalMessage;
	}

	public void setAdditionalMessage(String additionalMessage) {
		this.additionalMessage = additionalMessage;
	}
	
	
	

}
