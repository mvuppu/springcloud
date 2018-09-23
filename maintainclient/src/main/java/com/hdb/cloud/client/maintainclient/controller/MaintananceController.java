package com.hdb.cloud.client.maintainclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdb.cloud.client.maintainclient.model.CorPersonFlat;
import com.hdb.cloud.client.maintainclient.model.Corperson;
import com.hdb.cloud.client.maintainclient.service.MaintananceService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@RestController
@RequestMapping(value="/getOwners")
public class MaintananceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	@HystrixCommand(fallbackMethod="getOwnerFallback")
	public String getOwner() {
		String url="http://OWNER-SERVICES/getAllOwner";
		
		return restTemplate.getForObject(url, String.class);
	}
	
	public String getOwnerFallback(Throwable hystrixCommand) {
		return "Fall Back method for Owners";
	}
	@Autowired
	private MaintananceService maintananceService;
	
	@RequestMapping(value = "/getAllOwners", method = RequestMethod.GET,
			produces = { "application/json" })
	
	public ResponseEntity<List<Corperson>> getAllOwners(){
		List<Corperson> person = maintananceService.getAllCustomer();
		return new ResponseEntity<List<Corperson>>(person,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getCustomerDetail", method = RequestMethod.GET)
	
	public ResponseEntity<List<CorPersonFlat>> getCustomerDetail(){
		List<CorPersonFlat> person = maintananceService.getCustomerDetail("V1");
		return new ResponseEntity<List<CorPersonFlat>>(person,HttpStatus.OK);
	}
	
	
	@GetMapping("/{username}")
	public ResponseEntity<List<CorPersonFlat>> getFlatOwner(@PathVariable("username") final String username){
		
		String url="http://DB-SERVICE/rest/db/"+username;		
		List<CorPersonFlat> ownerList = (List<CorPersonFlat>) restTemplate.getForObject(url, List.class);
		//restTemplate.exchange(url, null,new ParameterizedTypeReference<List<CorPersonFlat>>() {
		//});
		return new ResponseEntity<List<CorPersonFlat>>(ownerList,HttpStatus.OK);
	}
	
}
