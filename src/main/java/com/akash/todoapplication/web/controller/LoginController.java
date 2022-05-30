package com.akash.todoapplication.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	// /login => "Hello World"
//	@ResponseBody
	// => used to print the exact return value as response tto the browser

	@RequestMapping(value = "/")
	public String homePage() {
		return "redirect:/login";
	}

	@RequestMapping(value = "/login")
	public String LoginMessage(@RequestParam(required = false) String name, ModelMap model) {
		model.put("name", name);
		return "login";
	}

}

//@RequestMapping => indiacates that the method is sending response for a given page
//ResponseBody => if this annotation is not presnet then spring boot will start looking for a view/jsp file of the returned string value instead of printing the string
