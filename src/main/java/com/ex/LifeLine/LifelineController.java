package com.ex.LifeLine;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LifelineController {
     @Autowired
	 private PatientRepository patientRepository;

	@GetMapping("/")
	public String showHomePage(Model model) {
		model.addAttribute("message", "Welcome to LifeLine Hospital Management System!");
		return "home";
	}

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String handleLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		if (username.equals("admin") && password.equals("password")) {
			model.addAttribute("message", "Login Successful!");
			return "dashboard";
		} else {
			model.addAttribute("error", "Invalid Credentials");
			return "login";
		}
	}

	@RequestMapping("/register")
	public String showPatientRegistrationPage() {
		return "register";
	}

	@PostMapping("/register")
	  public String handlePatientRegistration(
	            @RequestParam("firstName") String firstName,
	            @RequestParam("lastName") String lastName,
	            @RequestParam("gender") String gender,
	            @RequestParam("dob") String dateOfBirth,
	            @RequestParam("address") String address,
	            @RequestParam("contactNumber") String contactNumber,
	            @RequestParam("email") String email,
	            @RequestParam("bloodType") String bloodType,
	            @RequestParam("medicalHistory") String medicalHistory,
	            Model model) {

	        // Create new Patient object
	        Patient patient = new Patient(firstName, lastName, gender, dateOfBirth, address, contactNumber, email, bloodType, medicalHistory);

	       
			// Save the patient to the database
	        patientRepository.save(patient);

	        // Show success message
	        model.addAttribute("message", "Patient registered successfully: " + firstName);
	        return "register";
	    }
}
