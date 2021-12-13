package com.royer.trainig.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "training_set")
public class TrainingSet {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "numberReps")
	private Integer numberReps;
	
	@Column(name = "timeAvarage")
	private Integer timeAvarage;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "trainig_exercise_id", referencedColumnName = "ID")
	private TrainigExercise trainingExercise;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "routine_exercise_id", referencedColumnName = "ID")
	private RoutineExercise routineExerciseTrainingSet;

	public TrainingSet() {
	}

	public TrainingSet(Integer id, Integer numberReps, Integer timeAvarage, TrainigExercise trainingExercise,
			RoutineExercise routineExerciseTrainingSet) {
		
		this.id = id;
		this.numberReps = numberReps;
		this.timeAvarage = timeAvarage;
		this.trainingExercise = trainingExercise;
		this.routineExerciseTrainingSet = routineExerciseTrainingSet;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberReps() {
		return numberReps;
	}

	public void setNumberReps(Integer numberReps) {
		this.numberReps = numberReps;
	}

	public Integer getTimeAvarage() {
		return timeAvarage;
	}

	public void setTimeAvarage(Integer timeAvarage) {
		this.timeAvarage = timeAvarage;
	}

	public TrainigExercise getTrainingExercise() {
		return trainingExercise;
	}

	public void setTrainingExercise(TrainigExercise trainingExercise) {
		this.trainingExercise = trainingExercise;
	}

	public RoutineExercise getRoutineExerciseTrainingSet() {
		return routineExerciseTrainingSet;
	}

	public void setRoutineExerciseTrainingSet(RoutineExercise routineExerciseTrainingSet) {
		this.routineExerciseTrainingSet = routineExerciseTrainingSet;
	}
	
	
	
}
