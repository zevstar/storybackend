package com.lipkin.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipkin.story.models.Characters;
import com.lipkin.story.repositories.CharacterRepository;

@RestController
@RequestMapping("/api/v1/")
public class CharacterController {
	
	@Autowired
	private CharacterRepository characterRepo;
	
	@GetMapping("/allchildnames")
	public List<Characters> getAllChildnames () {
		return characterRepo.findAll();
	}

}
