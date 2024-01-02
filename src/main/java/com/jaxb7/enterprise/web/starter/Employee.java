package com.jaxb7.enterprise.web.starter;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fNme;
	private String lName;
	public String getfNme() {
		return fNme;
	}
	public void setfNme(String fNme) {
		this.fNme = fNme;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

}
