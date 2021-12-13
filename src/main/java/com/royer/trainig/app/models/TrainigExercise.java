package com.royer.trainig.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainig_exercise")
public class TrainigExercise {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "bodyPart")
	private String bodyPart;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "imageExercise")
	private String imageExercise;
	
	@Column(name = "videoExercise")
	private String videoExercise;

	public TrainigExercise() {
	}

	public TrainigExercise(Integer id, String name, String bodyPart, String description, String imageExercise,
			String videoExercise) {
		this.id = id;
		this.name = name;
		this.bodyPart = bodyPart;
		this.description = description;
		this.imageExercise = imageExercise;
		this.videoExercise = videoExercise;
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

	public String getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageExercise() {
		return imageExercise;
	}

	public void setImageExercise(String imageExercise) {
		this.imageExercise = imageExercise;
	}

	public String getVideoExercise() {
		return videoExercise;
	}

	public void setVideoExercise(String videoExercise) {
		this.videoExercise = videoExercise;
	}
	
	
	

}
