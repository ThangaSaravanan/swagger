package com.swaggerExercise.programSwagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swaggerExercise.programSwagger.entity.District;
import com.swaggerExercise.programSwagger.repository.CitiesRepository;
import com.swaggerExercise.programSwagger.repository.DistrictRepository;

@Service
public class DistrictService {
	@Autowired
	private DistrictRepository districtRepository;
	@Autowired
	private CitiesRepository citiesRepository;
	
	public void addDetails(District district) {
		districtRepository.save(district);
	}
	
	public List<District> getDetails() {
		List<District>districts=districtRepository.findAll();
		return districts;
		
	}
	
	public void deleteById(int id) {
		districtRepository.deleteById(id);
	}

}
