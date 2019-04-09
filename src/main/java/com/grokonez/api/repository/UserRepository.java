package com.grokonez.api.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.model.User;

public interface UserRepository extends JpaRepository<User, Id> {


}
