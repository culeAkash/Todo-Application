package com.akash.todoapplication.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	// /login => "Hello World"
	@RequestMapping(value = "/login")
//	@ResponseBody=> used to print the exact return value as response tto the browser
	public String LoginMessage() {
		return "login";
	}
}

//@RequestMapping => indiacates that the method is sending response for a given page
//ResponseBody => if this annotation is not presnet then spring boot will start looking for a view/jsp file of the returned string value instead of printing the string
