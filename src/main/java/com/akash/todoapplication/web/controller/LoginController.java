package com.akash.todoapplication.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.akash.todoapplication.web.service.LoginService;

@Controller
public class LoginController {

	// Dependency injection
	@Autowired
	LoginService service;
	// /login => "Hello World"
//	@ResponseBody
	// => used to print the exact return value as response tto the browser

	@RequestMapping(value = "/")
	public String homePage() {
		return "redirect:/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String LoginMessage(ModelMap model) {
//		model.put("name", name);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST) // handles post request
	public String LoginMessagePost(@RequestParam String name, @RequestParam String password, ModelMap model) {
		boolean isValidUser = this.service.validateUser(name, password);
		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "/login";
		}
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}// @RequestParam is used to access the parameters passed as body of post
		// request, by label names in view file

}

//@RequestMapping => indiacates that the method is sending response for a given page
//ResponseBody => if this annotation is not presnet then spring boot will start looking for a view/jsp file of the returned string value instead of printing the string
