package com.royer.trainig.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.royer.trainig.app.models.TrainigExercise;

@Repository
public interface TrainigExerciseRepository extends JpaRepository<TrainigExercise, Integer>{

}
