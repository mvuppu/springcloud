package com.hdb.cloud.client.maintainclient.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "corblockdetails")
public class Corblockdetails {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBlocknumber() {
		return blocknumber;
	}
	public void setBlocknumber(String blocknumber) {
		this.blocknumber = blocknumber;
	}
	public String getUpdateuser() {
		return updateuser;
	}
	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "block_id")
	private Long id;
	private String blocknumber;
	private String updateuser;
	
	/*@OneToMany(mappedBy="corblockdetails")
    private Set<Corflatdetails> flatdetails;

	public Set<Corflatdetails> getFlatdetails() {
		return flatdetails;
	}
	public void setFlatdetails(Set<Corflatdetails> flatdetails) {
		this.flatdetails = flatdetails;
	}*/
}
