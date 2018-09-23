package com.maintenance.dbservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "corperson")
public class Corperson {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="user_id")
	private String user_id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="middlename")
	private String middlename;
	@Column(name="lastname")
	private String lastname;
	@Column(name="flat_id")
	private Long flat_id;
	@Column(name="updateuser")
	private String updateuser;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getFlat_id() {
		return flat_id;
	}
	public void setFlat_id(Long flat_id) {
		this.flat_id = flat_id;
	}
	public String getUpdateuser() {
		return updateuser;
	}
	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}
}
