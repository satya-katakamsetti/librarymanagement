package com.lms.squad4.entity.requests;

import com.lms.squad4.entity.pojo.RequestType;

public class BorrowReturn {
	
	private int userId;
	private RequestType requestType;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public RequestType getRequestType() {
		return requestType;
	}
	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}
	
	
}
