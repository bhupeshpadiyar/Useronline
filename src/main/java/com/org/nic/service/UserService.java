package com.org.nic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.nic.entity.UserProfile;
import com.org.nic.contract.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserProfile> getAllDetails() { // for getting all details

		List<UserProfile> user = new ArrayList<>();
		userRepository.findAll().forEach(user::add); // lambda expression
		return user;
	}

	public Optional<UserProfile> getDetails(String email) { // for getting specific details

		return userRepository.findById(email);

	}

	public void updateUserData(UserProfile user2) { // for updating table
		System.out.println("User Profile :" + user2 + "       =============      Email: " +user2.getEmail() );
		userRepository.save(user2);

	}
}
