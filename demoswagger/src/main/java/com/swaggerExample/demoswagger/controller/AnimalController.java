package com.swaggerExample.demoswagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swaggerExample.demoswagger.entity.Animal;
import com.swaggerExample.demoswagger.service.AnimalService;

@RestController
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	
	@PostMapping("/addDetails")
	public String create(@RequestBody Animal animal) {
		animalService.addDetais(animal);
		return "added";
	}

}
