package com.mandasriram.photoapp.api.users.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandasriram.photoapp.api.users.ui.model.UserCreateRequestModel;

@RestController
@RequestMapping("/users")
public class UsersController {

	@GetMapping("/status/check")
	public String status()
	{
		
		return "working";
	}
	
	@PostMapping
	public String createuser( @RequestBody	UserCreateRequestModel userdetails)
	{
		
		
		return "post mapping method is called ";
	}
}
