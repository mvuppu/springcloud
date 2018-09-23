package com.maintenance.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.maintenance.dbservice.model.Corperson;

public interface PersonRepository extends CrudRepository<Corperson, Integer>{

	//@Query(value="select a.flatnumber,b.firstname,b.middlename,b.lastname from corperson b, corflatdetails a where a.id=b.flat_id and  b.user_id in(select id from user where username = ?1)", nativeQuery = true)
	//List<Object> getFlatOwnerDetails(@Param("username") String username);
	
}
