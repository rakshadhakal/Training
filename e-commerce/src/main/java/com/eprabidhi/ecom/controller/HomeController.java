package com.eprabidhi.ecom.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eprabidhi.ecom.model.Role;
import com.eprabidhi.ecom.model.UserDetail;
import com.eprabidhi.ecom.service.UserDetailService;

@Controller
public class HomeController {
	@GetMapping("/")
	public String  openHome() {
		return "index";
	}
	
	@GetMapping("/home")
	public String  homes() {
		return "home";
	}
	
	@GetMapping("/register")
	public String userregistration() {
		return "register_form";
	}
	
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	private UserDetailService userdetailService;
	
	@PostMapping("/register_form")
	public String registerUser
	(@RequestParam("user_name") String name,
    @RequestParam("user_address") String address,
    @RequestParam("user_dob") String dob,
    @RequestParam("user_username") String username,
    @RequestParam("user_email") String email,
    @RequestParam("user_password") String password,
    @RequestParam("role") String role) {
		UserDetail user = new UserDetail();
		user.setName(name);
		user.setAddress(address);
		user.setDob(LocalDate.parse(dob));
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		
		Role userRole = new Role();
		if(role.equals("user")) {
		user.setEnabled("1");   //user is enables
		userRole.setUserRole("ROLE_USER");
		}else {
			user.setEnabled("0");  //admin is disable at first
		userRole.setUserRole("ROLE_ADMIN");
	}
		//associate userDetail and userRole objects
		userRole.setUserDetail(user);
		user.setRole(userRole);
		
		userdetailService.addUser(user);
		
		
		return "redirect:/login";
		
	}
	
}
