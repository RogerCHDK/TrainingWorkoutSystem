package com.royer.trainig.app.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "user",  fetch = FetchType.LAZY)
	private List<WeightControl> weightControl;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "userRoutineExercise",  fetch = FetchType.LAZY)
	private List<RoutineExercise> routineExercise;

	
	public Users(Integer id, String name, String email, String password, List<WeightControl> weightControl,
			List<RoutineExercise> routineExercise) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.weightControl = weightControl;
		this.routineExercise = routineExercise;
	}

	public Users() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<WeightControl> getWeightControl() {
		return weightControl;
	}

	public void setWeightControl(List<WeightControl> weightControl) {
		this.weightControl = weightControl;
	}
	
	public List<RoutineExercise> getRoutineExercise() {
		return routineExercise;
	}

	public void setRoutineExercise(List<RoutineExercise> routineExercise) {
		this.routineExercise = routineExercise;
	}


//	@Override
//	public String toString() {
//		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", weightControl="
//				+ weightControl + "]";
//	}
	

}
