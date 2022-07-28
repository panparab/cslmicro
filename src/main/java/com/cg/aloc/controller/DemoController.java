package com.cg.aloc.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/genx")

public class DemoController {


	@GetMapping(value = "/getApi")
	public String getApi() {
		return "Hello Team CSL!!!!";
	}
	
	@GetMapping(value = "/getResult")
	public String getResult() {
		return "Have a Good day !!!!";
	}
}
