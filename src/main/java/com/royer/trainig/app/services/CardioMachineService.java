package com.royer.trainig.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royer.trainig.app.dto.RequestCardioMachineDto;
import com.royer.trainig.app.models.CardioMachine;
import com.royer.trainig.app.repository.CardioMachineRepository;

@Service
public class CardioMachineService {
	@Autowired CardioMachineRepository cardioMachineRepository;
	
	public List<CardioMachine> getAllCardioMachine() {
		List<CardioMachine> cardioMachineList = new ArrayList<CardioMachine>();
		cardioMachineRepository.findAll().forEach(cardioMachineList::add);
		return cardioMachineList;
	}
	
	public void updatedCardioMachine(List<Integer> cardioMachineIds) {
		List<Optional <CardioMachine> >cardioMachines = cardioMachineIds
				.stream()
				.map(cd -> cardioMachineRepository.findById(cd))
				.collect(Collectors.toList());
		cardioMachines.forEach(c-> System.out.println(c.toString()));
//		cardioMachineIds.forEach(machine -> cardioMachineRepository.save(null));
	}
	
	
}
