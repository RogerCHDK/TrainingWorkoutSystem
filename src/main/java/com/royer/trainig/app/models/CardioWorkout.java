package com.royer.trainig.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cardio_workout")
public class CardioWorkout {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "calories")
	private Integer calories;
	
	@Column(name = "distance")
	private Integer distance;
	
	@Column(name = "velocity_avarage")
	private Integer velocity_avarage;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "cardio_set_id", referencedColumnName = "ID")
	private CardioSet cardioSet;

	public CardioWorkout() {
	}

	public CardioWorkout(Integer id, Integer calories, Integer distance, Integer velocity_avarage,CardioSet cardioSet) {
	
		this.id = id;
		this.calories = calories;
		this.distance = distance;
		this.velocity_avarage = velocity_avarage;
		this.cardioSet = cardioSet;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getVelocity_avarage() {
		return velocity_avarage;
	}

	public void setVelocity_avarage(Integer velocity_avarage) {
		this.velocity_avarage = velocity_avarage;
	}

	public CardioSet getCardioSet() {
		return cardioSet;
	}

	public void setCardioSet(CardioSet cardioSet) {
		this.cardioSet = cardioSet;
	}
	
	
}
