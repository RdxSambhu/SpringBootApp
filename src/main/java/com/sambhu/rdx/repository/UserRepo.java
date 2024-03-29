package com.sambhu.rdx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sambhu.rdx.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

	
}
