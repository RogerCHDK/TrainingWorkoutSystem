package com.royer.trainig.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.royer.trainig.app.dto.RequestCardioMachineDto;
import com.royer.trainig.app.models.CardioMachine;
import com.royer.trainig.app.services.CardioMachineService;

@RestController
@RequestMapping("/cardio-machine")
public class CardioMachineController {
	
	@Autowired CardioMachineService cardioMachineService;
	
	@GetMapping
	public ResponseEntity<List<CardioMachine>> index(){
		List<CardioMachine> cardioMachineList = cardioMachineService.getAllCardioMachine();
		return new ResponseEntity<List<CardioMachine>>(cardioMachineList, new HttpHeaders(), HttpStatus.OK);
	}   
	
	@PatchMapping
	public ResponseEntity<List<String>> update(@RequestBody RequestCardioMachineDto request){
//		System.out.println("Entre jeje");
//		System.out.println(request.getCardioMachineIds());
		cardioMachineService.updatedCardioMachine(request.getCardioMachineIds());
		return new ResponseEntity<List<String>>(List.of("Hola"), new HttpHeaders(), HttpStatus.OK);
	}  

}
