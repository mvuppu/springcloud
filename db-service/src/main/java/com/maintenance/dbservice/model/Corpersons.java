package com.maintenance.dbservice.model;

import java.util.List;

public class Corpersons {
	private List<Corperson> person;
	private String userName;
	
	
	
	public Corpersons(List<Corperson> person, String userName) {
		super();
		this.person = person;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Corperson> getPerson() {
		return person;
	}

	public void setPerson(List<Corperson> person) {
		this.person = person;
	}
}
