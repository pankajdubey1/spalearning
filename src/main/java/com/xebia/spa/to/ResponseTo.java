package com.xebia.spa.to;

import org.codehaus.jettison.json.JSONObject;


public class ResponseTo {

	private String message = "";
	
	private String status = "";

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String toJSON() {

		JSONObject json = new JSONObject();

		try {
			json.put("message", getMessage());
		} catch (Exception e) {
		}

		return json.toString();
	}

	
	
	
}
