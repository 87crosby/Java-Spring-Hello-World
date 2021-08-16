package com.howe.hellohuman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	
	@GetMapping("/")
	public String normal() {
		return "Hello Human";
	}
	
	@RequestMapping("/{name}")
	public String index(@PathVariable("name") String name) {
		return "Hello " + name;
	}

}
