package com.swaggerExercise.programSwagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swaggerExercise.programSwagger.entity.Cities;

public interface CitiesRepository extends JpaRepository<Cities, Integer> {

}
