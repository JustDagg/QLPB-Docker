package com.example.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.SignupDTO;
import com.example.entity.Account;
import com.example.repository.IAccountRepository;
import com.example.service.IAccountService;

@RestController
@RequestMapping(value = "api/v1/signup")
@CrossOrigin("*")
public class SignupController {
	
	@Autowired
	private IAccountRepository acRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IAccountService service;
	
	@PostMapping("") 
	@Transactional
	public ResponseEntity<?> registerUser(@RequestBody SignupDTO signupDTO) {
		System.out.println(signupDTO.toString());
		if (acRepository.existsByUsername(signupDTO.getUsername())) {
			return ResponseEntity.badRequest().body("Error: Username is already taken!");
		}
		
		Account ac = modelMapper.map(signupDTO, Account.class);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String enCryptPassword = passwordEncoder.encode(signupDTO.getPassword());
		ac.setPassword(enCryptPassword);
		
		//acRepository.save(ac);
		
		service.addNewAccount(ac);
		
		return ResponseEntity.ok().body("User registered successfully!");
	}
}
