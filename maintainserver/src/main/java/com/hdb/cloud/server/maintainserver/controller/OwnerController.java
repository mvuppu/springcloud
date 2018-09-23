package com.hdb.cloud.server.maintainserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/getAllOwner")
public class OwnerController {

	@GetMapping
	public String getOwner() {
		return "Owner service";
	}
}
