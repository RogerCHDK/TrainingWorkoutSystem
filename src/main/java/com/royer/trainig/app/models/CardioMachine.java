package com.royer.trainig.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cardio_machine")
public class CardioMachine {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "imageWorkout")
	private String imageWorkout;
	
	@Column(name = "description")
	private String description;

	public CardioMachine() {
	}

	public CardioMachine(Integer id, String name, String imageWorkout, String description) {
	
		this.id = id;
		this.name = name;
		this.imageWorkout = imageWorkout;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageWorkout() {
		return imageWorkout;
	}

	public void setImageWorkout(String imageWorkout) {
		this.imageWorkout = imageWorkout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
