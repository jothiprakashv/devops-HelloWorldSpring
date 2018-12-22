package com.wipro.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String sayHello(@ModelAttribute Hello hello, Map<String, String> map) {
		map.put("msg", hello.getName());
		return "hello";
	}
}










