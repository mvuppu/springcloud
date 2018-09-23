package com.hdb.cloud.client.maintainclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdb.cloud.client.maintainclient.model.Corperson;


@Repository
public interface CustomerRepository  extends JpaRepository<Corperson, Long>{
	
	/*@Query("select firstname,middlename,lastname,flat_id from corperson")
	public List<Corperson> getAllCustomer();*/
}
