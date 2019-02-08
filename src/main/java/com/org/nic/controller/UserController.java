package com.org.nic.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.nic.entity.UserProfile;
import com.org.nic.service.UserService;

@RequestMapping("/user")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/get/{email}/find")
	public ResponseEntity<Map<String, Object>> getUser(@PathVariable("email") String email) {
		System.out.println("Email value @RequestBody ::: for Search :::" + email);
		HttpHeaders responseHeaders = new HttpHeaders();
		Optional<UserProfile> optnl = userService.getDetails(email);
		
		Map<String, Object> response = new LinkedHashMap<>();
		
		System.out.println(optnl);

		if (!optnl.isPresent()) {
			//responseHeaders.set("message", "Please check User does not exist !!!");
			response.put("message", "Please check User does not exist !!!");
			responseHeaders.set("responseCode", "404");
			response.put("body", null);
			return ResponseEntity.notFound().headers(responseHeaders).build();
		} else {
			//responseHeaders.set("message", "Your request is consumed sucessfully !!!");
			responseHeaders.set("responseCode", "200");
			response.put("message", "Your request is consumed sucessfully !!");
			response.put("body", optnl.get());
			return ResponseEntity.ok().headers(responseHeaders).body(response);
		}

	}
	
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserProfile>> getAllUsers() {
		HttpHeaders responseHeaders = new HttpHeaders();
		List<UserProfile> usersList = userService.getAllDetails();
		
		System.out.println(usersList.toString());

		if (usersList.size() > 0) {
			responseHeaders.set("message", "Your request is consumed sucessfully !!!");
			responseHeaders.set("responseCode", "200");
			return ResponseEntity.ok().headers(responseHeaders).body(usersList);
		} else {
			responseHeaders.set("message", "No Users Found in the DB.");
			responseHeaders.set("responseCode", "404");
			return ResponseEntity.ok().headers(responseHeaders).body(usersList);
		}

	}

	@PostMapping("/up")
	public ResponseEntity<UserProfile> updateUserProfile(@RequestBody UserProfile user) {
		System.out.println("Email value @RequestBody ::: for Update :::" + user.getEmail());
		HttpHeaders responseHeaders = new HttpHeaders();
		Optional<UserProfile> optnl = userService.getDetails(user.getEmail());

		if (!optnl.isPresent()) {
			responseHeaders.set("message", "New User Created.. !!!");
			responseHeaders.set("responseCode", "200");
			userService.updateUserData(user);
			return ResponseEntity.accepted().headers(responseHeaders).body(user);

		} else {
			userService.updateUserData(user);
			responseHeaders.set("message", "Existing User Updated !!!");
			responseHeaders.set("responseCode", "200");
			return ResponseEntity.accepted().headers(responseHeaders).body(user);
		}

	}

}
