package com.sambhu.rdx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sambhu.rdx.model.User;
import com.sambhu.rdx.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private  UserRepo userRepo;

	public  List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> user = userRepo.findAll();
		return user;
	}

	
}
