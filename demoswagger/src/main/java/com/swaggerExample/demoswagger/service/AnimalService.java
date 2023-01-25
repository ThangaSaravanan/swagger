package com.swaggerExample.demoswagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swaggerExample.demoswagger.entity.Animal;
import com.swaggerExample.demoswagger.repository.AnimalRepository;
import com.swaggerExample.demoswagger.repository.AnimalTypeRepository;

@Service
public class AnimalService {
	@Autowired
	private AnimalRepository animalRepository;
	@Autowired
	private AnimalTypeRepository animalTypeRepository;
	
	public void addDetais(Animal animal) {
		animalRepository.save(animal);
	}
	

}
