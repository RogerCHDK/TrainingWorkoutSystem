package com.royer.trainig.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.royer.trainig.app.models.Users;
import com.royer.trainig.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired UserRepository userRepository;
	
	public List<Users> getAllUsers () {
		List<Users> users = new ArrayList<Users>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public Users createOrUpdateUser(Users entity) {
		Optional<Users> user = userRepository.findById(entity.getId());
		
		if (user.isPresent()) {
			Users newEntity = user.get();
//			newEntity.setEmail(entity.getEmail());
			newEntity.setName(entity.getName());
//			newEntity.setPassword(entity.getPassword());
			
			newEntity = userRepository.save(newEntity);
			
			return newEntity;
		}else {
			entity = userRepository.save(entity);
			
			return entity;
		}
	}
}
