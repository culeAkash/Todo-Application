package com.akash.todoapplication.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	// /login => "Hello World"
	@RequestMapping(value = "/login")
	@ResponseBody
	public String LoginMessage() {
		return "Hello World";
	}
}

//@RequestMapping => indiacates that the method is sending response for a given page
//ResponseBody => if this annotation is not presnet then spring boot will start looking for a view/jsp file of the returned string value instead of printing the string
