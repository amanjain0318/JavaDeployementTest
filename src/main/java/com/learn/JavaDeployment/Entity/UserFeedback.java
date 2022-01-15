package com.learn.JavaDeployment.Entity;

public class UserFeedback {
	
	private  int userFeedbackId;
	
	private String userFeedbackName ;
	private String userFeedbackEmail;
	
	private String userFeedbackSubject;
	
	private String userFeedbackMessage;
	
	/**
	 * 
	 */
	public UserFeedback() {
		super();
	}

	/**
	 * @param userFeedbackId
	 * @param userFeedbackName
	 * @param userFeedbackEmail
	 * @param userFeedbackSubject
	 * @param userFeedbackMessage
	 */
	public UserFeedback(int userFeedbackId, String userFeedbackName, String userFeedbackEmail,
			String userFeedbackSubject, String userFeedbackMessage) {
		super();
		this.userFeedbackId = userFeedbackId;
		this.userFeedbackName = userFeedbackName;
		this.userFeedbackEmail = userFeedbackEmail;
		this.userFeedbackSubject = userFeedbackSubject;
		this.userFeedbackMessage = userFeedbackMessage;
	}

	public int getUserFeedbackId() {
		return userFeedbackId;
	}

	public void setUserFeedbackId(int userFeedbackId) {
		this.userFeedbackId = userFeedbackId;
	}

	public String getUserFeedbackName() {
		return userFeedbackName;
	}

	public void setUserFeedbackName(String userFeedbackName) {
		this.userFeedbackName = userFeedbackName;
	}

	public String getUserFeedbackEmail() {
		return userFeedbackEmail;
	}

	public void setUserFeedbackEmail(String userFeedbackEmail) {
		this.userFeedbackEmail = userFeedbackEmail;
	}

	public String getUserFeedbackSubject() {
		return userFeedbackSubject;
	}

	public void setUserFeedbackSubject(String userFeedbackSubject) {
		this.userFeedbackSubject = userFeedbackSubject;
	}

	public String getUserFeedbackMessage() {
		return userFeedbackMessage;
	}

	public void setUserFeedbackMessage(String userFeedbackMessage) {
		this.userFeedbackMessage = userFeedbackMessage;
	}
	
	
	
	
}
