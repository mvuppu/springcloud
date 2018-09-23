package com.maintenance.dbservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "corflatdetails")
public class Corflatdetails {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//@OneToMany(mappedBy="corblockdetails")
	public String getBlock_id() {
		return block_id;
	}
	public void setBlock_id(String block_id) {
		this.block_id = block_id;
	}
	public String getFlatnumber() {
		return flatnumber;
	}
	public void setFlatnumber(String flatnumber) {
		this.flatnumber = flatnumber;
	}
	public String getUpdateuser() {
		return updateuser;
	}
	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}
	private String block_id;
	private String flatnumber;
	private String updateuser;
}
