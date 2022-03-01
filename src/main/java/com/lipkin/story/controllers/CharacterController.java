package com.lipkin.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipkin.story.exceptions.ResourceNotFoundException;
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
	@GetMapping("allchildnames/name/{childname}")
	public List<Character> getChildnameByChildname(@PathVariable String childname) {
		List<Character> newchildname = characterRepo.findByChildname(childname);
			if(newchildname.isEmpty()) {
				System.out.println(new ResourceNotFoundException("Child with the name " + childname + " not found."));
			}
			return characterRepo.findByChildname(childname);
	}
	// 2/22 04:17
	@PostMapping("add/childname")
	public Character newChildname(@RequestBody Character childname) {
		return characterRepo.save(childname);
	}
//	@PostMapping("add/parent1")
//	public Character newParent1(@RequestBody Character parent1) {
//		return characterRepo.save(parent1);
//	}
//	@PostMapping("add/parent2")
//	public Character newParent2(@RequestBody Character parent2) {
//		return characterRepo.save(parent2);
//	}
//	@PostMapping("add/donor1")
//	public Character newDonor1(@RequestBody Character donor1) {
//		return characterRepo.save(donor1);
//	}
//	@PostMapping("add/donor2")
//	public Character newDonor2(@RequestBody Character donor2) {
//		return characterRepo.save(donor2);
//	}
	
}
