package com.swaggerExample.demoswagger.entity;

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
@Table(name = "animal_type")

public class AnimalType {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	
	@Column(name = "animal_type_id")
	private int typeId;
	
	@Column(name = "animal_type")
	private String animalType;
	
	

}
