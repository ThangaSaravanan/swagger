package com.swaggerExercise.programSwagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swaggerExercise.programSwagger.entity.District;
import com.swaggerExercise.programSwagger.service.DistrictService;

@RestController
public class DistrictController {
	@Autowired
	private DistrictService districtService;
	
	@PostMapping("/addDetails")
	public String create (@RequestBody District district) {
		districtService.addDetails(district);
		return"added";
	}
	
	@GetMapping("/getAll")
	public List<District>get(){
		List<District>districts=districtService.getDetails();
		return districts;
	}
	
	@PutMapping("/updateNew")
	public String createNew(@RequestBody District district) {
		districtService.addDetails(district);
		return"added";
	}
	
	@DeleteMapping("/deleteOne")
	public String delete(@PathVariable ("id")int id) {
		districtService.deleteById(id);
		return "deleted";
	}

}
