package com.example.springbootdemos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemos.repositories.PersonRepository;

@RestController
@RequestMapping("/people")
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;

}
