package com.swaggerExample.demoswagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swaggerExample.demoswagger.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
