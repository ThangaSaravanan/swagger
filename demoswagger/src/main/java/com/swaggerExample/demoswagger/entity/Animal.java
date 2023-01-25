package com.swaggerExample.demoswagger.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "animal")

public class Animal {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	
	@Column(name = "animal_id")
	private int id;
	
	@Column(name = "animal_name")
	private String animalName;
	
	@OneToMany(targetEntity = AnimalType.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="animal_id",referencedColumnName = "animal_id")
	private List<AnimalType> animalTypes;
	
	
	

}
