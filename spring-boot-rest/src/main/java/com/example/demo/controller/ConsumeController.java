package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeController {

	@Autowired
	RestTemplate template;
	
	@RequestMapping("/allEmpDetails")
	public String getAllDetails() {
		
		HttpHeaders hd= new HttpHeaders();
		hd.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity e = new HttpEntity(hd);
		
		return template.exchange("http://localhost:8080/allemp", HttpMethod.GET, e, String.class).getBody();
		
	}
	
}
