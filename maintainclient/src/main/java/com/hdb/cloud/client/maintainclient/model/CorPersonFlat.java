package com.hdb.cloud.client.maintainclient.model;

import java.io.Serializable;

public class CorPersonFlat implements Serializable{

	private String firstname;
	private String lastname;
	private String middlename;
	private String flatnumber;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getBlocknumber() {
		return blocknumber;
	}
	public void setBlocknumber(String blocknumber) {
		this.blocknumber = blocknumber;
	}
	public String getFlatnumber() {
		return flatnumber;
	}
	public void setFlatnumber(String flatnumber) {
		this.flatnumber = flatnumber;
	}
	private String blocknumber;
}
