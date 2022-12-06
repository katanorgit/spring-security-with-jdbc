package com.handson.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.handson.demo.models.User;
import com.handson.demo.repository.UserRepository;
import com.handson.demo.utility.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUSERNAME(username);
		User user2 = user.get();
		System.out.println(user2);
		return new MyUserDetails(user2);
		
	}

}
