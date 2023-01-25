package com.swaggerExercise.programSwagger.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cities")
public class Cities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "cities_id")
    private int citiesId;
	
	@Column(name = "cities_name")
    private int citiesName;
	

}
