package com.demo.rest.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greeting {

	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String disp(String name) {
		return "hello" + name;
	}
}
