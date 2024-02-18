package com.sambhu.rdx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.sambhu.rdx.model.User;
import com.sambhu.rdx.service.UserService;

@Controller
public class LogInPageController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/")
	public String logInPage()
	{
		return "logIn";
	}
	@GetMapping(value = "/userHome")
	public String userHomePage(ModelMap model) {
		List<User> user = userService.getAllUsers();
		model.addAttribute("user",user);
		return "userHome";
	}

}
