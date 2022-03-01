package com.lipkin.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipkin.story.models.Character;
import com.lipkin.story.models.Storyline;
import com.lipkin.story.repositories.CharacterRepository;
import com.lipkin.story.repositories.StorylineRepository;

@RestController
@RequestMapping("/api/v1/")

public class StorylineController {
	
	@Autowired
	private StorylineRepository storylineRepo;
	
	@GetMapping("alltitles")
	public List<Storyline> getAllTitles () {
		return storylineRepo.findAll();
	}
	
//	@GetMapping("title/{id}")
//	public ResponseEntity<Title> getTitleById(@PathVariable int id) {
//		Title title = storylineRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Title not found."));
//				return ResponseEntity.ok(title);
//		
//	}
	
	
	

}
