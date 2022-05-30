package com.akash.todoapplication.web.service;

import org.springframework.stereotype.Component;

//Spring bean initialisation
@Component
public class LoginService {

	// Add first hardcoded validation
	public boolean validateUser(String name, String password) {
		if (name.equals("Akash Jaiswal") && password.equals("Akashjais@929")) {
			return true;
		}
		return false;
	}
}
