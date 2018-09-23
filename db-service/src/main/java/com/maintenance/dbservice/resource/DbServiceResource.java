package com.maintenance.dbservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maintenance.dbservice.model.CorPersonFlat;
import com.maintenance.dbservice.model.Corpersons;
import com.maintenance.dbservice.repository.PersonRepository;
import com.maintenance.dbservice.services.MaintananceService;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

	@Autowired
	private MaintananceService maintananceService;
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/{username}")
	public ResponseEntity<List<CorPersonFlat>> getOwnerDetails(@PathVariable("username") final String userName){
		List<CorPersonFlat> obj = maintananceService.getCustomerDetail(userName);		
		return new ResponseEntity<List<CorPersonFlat>>(obj,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public List<String> add(@RequestBody final Corpersons person){
		//list iterator and save
		//person.getPerson()
		//	.stream()
		//	.map(persons -> new Corperson(person,person.getUserName())
		//	.forEach(person -> personRepository.save(persons));
		
		return null;
	}
}
