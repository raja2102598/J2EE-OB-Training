package com.onebill.springrest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
	@GetMapping(path = "/hello")
	public String getHello() {
		return "Hellooo";
	}
	@PostMapping(path="/hello/{name}")
	public String postHello(@PathVariable String name) {
		return "Hello "+name;
		
	}
	
}
