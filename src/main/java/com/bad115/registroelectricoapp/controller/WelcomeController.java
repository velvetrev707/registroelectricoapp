package com.bad115.registroelectricoapp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@RequestMapping(value = {"/","login"}, method = RequestMethod.GET)
	public String home(Map<String, Object> model) {
		model.put("message", "Login");
		return "login/sign-in";
	}
	
	/*@RequestMapping
	public String*/ 
}
