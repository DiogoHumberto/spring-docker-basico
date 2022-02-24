package com.springdocker.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
	

	@Autowired
	private Environment environment;
	
	@GetMapping("/port")
	public ResponseEntity<String> getPortDocker(){
		
		return ResponseEntity.ok("Porta do serviço: " + environment.getProperty("local.server.port"));
		
	}
	
	@GetMapping("/name")
	public ResponseEntity<String> getNameDocker(){
		
		return ResponseEntity.ok("Name server: " + System.getenv("HOSTNAME"));
		
	}

}
