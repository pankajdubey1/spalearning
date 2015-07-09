package com.xebia.spa.error;

public class SpaException extends Exception{

	int errorcode;

	public int getErrorcode() {
		return errorcode;
	}

	public SpaException(int errorcode) {
		super();
		this.errorcode = errorcode;
	}

	public SpaException(String msg, int errorcode) {
		super(msg);
		this.errorcode = errorcode;
	}

	
	
	
}
