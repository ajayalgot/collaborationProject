package com.collaborate.model;

import java.util.Date;

public class Job 
{

	private int JobID;
	private String JobProfile,JobDecription,Qualification,Status;
	private Date PostDate;
	public int getJobID() {
		return JobID;
	}
	public void setJobID(int jobID) {
		JobID = jobID;
	}
	public String getJobProfile() {
		return JobProfile;
	}
	public void setJobProfile(String jobProfile) {
		JobProfile = jobProfile;
	}
	public String getJobDecription() {
		return JobDecription;
	}
	public void setJobDecription(String jobDecription) {
		JobDecription = jobDecription;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getPostDate() {
		return PostDate;
	}
	public void setPostDate(Date postDate) {
		PostDate = postDate;
	}
	
}