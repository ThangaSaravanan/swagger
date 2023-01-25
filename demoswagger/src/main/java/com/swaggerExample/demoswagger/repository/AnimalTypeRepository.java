package com.swaggerExample.demoswagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swaggerExample.demoswagger.entity.AnimalType;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Integer> {

}
