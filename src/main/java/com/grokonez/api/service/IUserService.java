package com.grokonez.api.service;

import java.util.List;

import com.grokonez.jwtauthentication.model.User;

public interface IUserService {
	List<User> buscarTodos();
}
