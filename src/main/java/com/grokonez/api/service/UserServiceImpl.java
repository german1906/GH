package com.grokonez.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.grokonez.api.repository.*;

import com.grokonez.jwtauthentication.model.User;

public class UserServiceImpl implements IUserService{
	
	@Autowired
	public UserRepository UserRepository;

	@Override
	public List<User> buscarTodos() {
		UserRepository.findAll();
		return null;
	}

}
