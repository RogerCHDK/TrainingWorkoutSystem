package com.royer.trainig.app.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "routine_exercise")
public class RoutineExercise {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "dateRoutine")
	private Date dateRoutine;
	
	@Column(name = "observations")
	private String observations;
	
	@Column(name = "timeBreak")
	private Integer timeBreak;
	
	@Column(name = "status")
	private Integer status;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JsonBackReference
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private Users userRoutineExercise;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "routineExerciseTrainingSet",  fetch = FetchType.LAZY)
	private List<TrainingSet> trainingSet;

	
	public RoutineExercise() {
	}
	

	public RoutineExercise(Integer id, Date dateRoutine, String observations, Integer timeBreak, Integer status,
			Users userRoutineExercise, List<TrainingSet> trainingSet) {
		this.id = id;
		this.dateRoutine = dateRoutine;
		this.observations = observations;
		this.timeBreak = timeBreak;
		this.status = status;
		this.userRoutineExercise = userRoutineExercise;
		this.trainingSet = trainingSet;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateRoutine() {
		return dateRoutine;
	}

	public void setDateRoutine(Date dateRoutine) {
		this.dateRoutine = dateRoutine;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Integer getTimeBreak() {
		return timeBreak;
	}

	public void setTimeBreak(Integer timeBreak) {
		this.timeBreak = timeBreak;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Users getUserRoutineExercise() {
		return userRoutineExercise;
	}

	public void setUserRoutineExercise(Users userRoutineExercise) {
		this.userRoutineExercise = userRoutineExercise;
	}

	public List<TrainingSet> getTrainingSet() {
		return trainingSet;
	}

	public void setTrainingSet(List<TrainingSet> trainingSet) {
		this.trainingSet = trainingSet;
	}
	
	

	
	
}
