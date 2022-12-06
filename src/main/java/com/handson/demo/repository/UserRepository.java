package com.handson.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.handson.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	  Optional<User>  findByUSERNAME(String username);

}
