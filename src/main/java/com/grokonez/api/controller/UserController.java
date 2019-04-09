package com.grokonez.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grokonez.api.service.IUserService;
import com.grokonez.jwtauthentication.model.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	public IUserService IUserService;
	
	@GetMapping("/auth/all")
	public List<User> buscarTodos(){
		 List<User> users = IUserService.buscarTodos();
		return users;
	}
}
