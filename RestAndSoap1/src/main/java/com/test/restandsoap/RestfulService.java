package com.test.restandsoap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class RestfulService {

	@GetMapping("/rest/{name}")
	public String greeting(@PathVariable String name) {
		return new String("Hello World from Rest  = " + name);

	}
}
