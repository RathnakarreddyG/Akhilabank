package com.akhilaBank.AkhilaBank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.akhilaBank.AkhilaBank.models.Customer;

@Controller
public class CustController {

	@GetMapping
	public String viewHomepage() {
		return "index";
	}

	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("customer", new Customer());

		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(Customer customer) {
//	    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//	    String encodedPassword = passwordEncoder.encode(user.getPassword());
//	    user.setPassword(encodedPassword);

//	    userRepo.save(user);

		return "register_success";
	}
}
