package com.lipkin.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipkin.story.models.Character;
import com.lipkin.story.repositories.CharacterRepository;

@RestController
@RequestMapping("/api/v1/")
public class CharacterController {
	
	@Autowired
	private CharacterRepository characterRepo;
	
	@GetMapping("allchildnames")
	public List<Character> getAllChildnames () {
		return characterRepo.findAll();
	}
	// 2:20 
//	@GetMapping("allchildnames/{childname}")
//	public List<Childname> getChildnameByChildname(@PathVariable String childname) {
//		List<Childname> childname = characterRepo.findByChildname(childname);
//			if(childname.isEmpty()) {
//				System.out.println(new ResourceNotFoundException("Child with the name " + childname + " not found."));
//			}
//			return characterRepo.findByChildname(childname);
//	}
	// 2/22 13:06
	@PostMapping("add/childname")
	public Character newChildname(@RequestBody Character childname) {
		return characterRepo.save(childname);
	}
	
	
	
	
	
}
