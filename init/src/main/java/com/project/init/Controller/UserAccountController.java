package com.project.init.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.init.UserRegistrationDto;
import com.project.init.Entity.UserAccount;
import com.project.init.Repo.UserAccountRepo;

@Controller
@RequestMapping("/user")
public class UserAccountController {

	 @Autowired
	    private UserAccountRepo userRepo;
	    // Other controller methods

	 @GetMapping("/")
	 public String showLoginPage() {
	        return "login";
	 }
	 
	 @GetMapping("/logout")
	 public String logout() {
	        return "login";
	 }
	 
	 @GetMapping("/register")
	 public String showRegisterPage() {
	        return "registration";
	 }
	 
	    @PostMapping("/register")
	    public String registerUser(@ModelAttribute UserRegistrationDto registrationDto) {
	        // Process the registrationDto and save the user
	        // Validation and saving logic here
	        UserAccount user = new UserAccount(registrationDto.getId(), registrationDto.getUsername(), registrationDto.getPassword(), registrationDto.getEmail());
	        userRepo.save(user);

	        // Redirect to a success page or login page
	        return "redirect:/";
	    }
	}
	

