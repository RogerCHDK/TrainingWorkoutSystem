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
@Table(name = "cardio_set")
public class CardioSet {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "cardio_machine_id", referencedColumnName = "ID")
	private CardioMachine cardioMachine;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "routine_exercise_id", referencedColumnName = "ID")
	private RoutineExercise routineExerciseCardioSet;

	public CardioSet() {
	}

	public CardioSet(Integer id, CardioMachine cardioMachine, RoutineExercise routineExerciseCardioSet) {
		
		this.id = id;
		this.cardioMachine = cardioMachine;
		this.routineExerciseCardioSet = routineExerciseCardioSet;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CardioMachine getCardioMachine() {
		return cardioMachine;
	}

	public void setCardioMachine(CardioMachine cardioMachine) {
		this.cardioMachine = cardioMachine;
	}

	public RoutineExercise getRoutineExerciseCardioSet() {
		return routineExerciseCardioSet;
	}

	public void setRoutineExerciseCardioSet(RoutineExercise routineExerciseCardioSet) {
		this.routineExerciseCardioSet = routineExerciseCardioSet;
	}
	
	
}
