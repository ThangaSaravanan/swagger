package com.swaggerExercise.programSwagger.entity;

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
@Table(name = "district")
public class District {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		@Column(name = "district_id")
	    private int districtId;
		
		@Column(name = "district_name")
	    private int districtName;
		
		@OneToMany(targetEntity = Cities.class,cascade = CascadeType.ALL)
		@JoinColumn(name = "district_id",referencedColumnName = "district_id" )
		private List<Cities>cities;
		}


