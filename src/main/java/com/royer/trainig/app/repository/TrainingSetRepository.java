package com.royer.trainig.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.royer.trainig.app.models.TrainingSet;

@Repository
public interface TrainingSetRepository extends JpaRepository<TrainingSet, Integer>{

}
