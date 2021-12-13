package com.royer.trainig.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.royer.trainig.app.models.RoutineExercise;
import com.royer.trainig.app.models.Users;
import com.royer.trainig.app.models.WeightControl;
import com.royer.trainig.app.repository.RoutineExerciseRepository;
import com.royer.trainig.app.repository.UserRepository;
import com.royer.trainig.app.repository.WeightControlRepository;

@RestController
public class HomeController {

	@Autowired UserRepository userRepository;
	@Autowired WeightControlRepository weightControlRepository;
	@Autowired RoutineExerciseRepository routineExerciseRepository;
	
	@GetMapping("/")
	public List<Users> home () {
		List<Users> users = new ArrayList<Users>();
		userRepository.findAll().forEach(users::add);
//		for (Users user : users) {
//			System.out.println(user);
//		}
		return users;
	}
	
	@GetMapping("/weight")
	public List<WeightControl> control() {
		List<WeightControl> weightsControls = new ArrayList<WeightControl>();
		weightControlRepository.findAll().forEach(weightsControls::add);
//		for (WeightControl control : weightsControls) {
//			System.out.println(control);
//		}
		return weightsControls;
	}
	
	@GetMapping("/routine-exercise")
	public List<RoutineExercise> routineExercise() {
		List<RoutineExercise> routineExerciseList = new ArrayList<RoutineExercise>();
		routineExerciseRepository.findAll().forEach(routineExerciseList::add);
		return routineExerciseList;
	}
}
