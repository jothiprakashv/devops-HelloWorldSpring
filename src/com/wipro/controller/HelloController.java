package com.wipro.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author JOE
 *	This class defines the controller for the project
 */
@Controller
public class HelloController {
	
	/**
	 * @return The view for index
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	/**
	 * @param hello: This is the bean object
	 * @param map: This is the collection for storing the messages
	 * @return The view for hello
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String sayHello(@ModelAttribute Hello hello, Map<String, String> map) {
		map.put("msg", hello.getName());
		return "hello";
	}
}










