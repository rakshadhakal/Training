package com.eprabidhi.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	@GetMapping("/admin/home")
	public String dashboard() {
		return"admin/dashboard";
	}
	@GetMapping("/admin/blank")
	public String blank() {
		return"admin/blank";
	}
	

}
