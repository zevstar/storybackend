package com.lipkin.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipkin.story.models.Characters;
import com.lipkin.story.models.Storylines;
import com.lipkin.story.repositories.CharacterRepository;
import com.lipkin.story.repositories.StorylineRepository;

@RestController
@RequestMapping("/api/v1/")

public class StorylineController {
	
	@Autowired
	private StorylineRepository storylineRepo;
	
	@GetMapping("/alltitles")
	public List<Storylines> getAllTitles () {
		return storylineRepo.findAll();
	}

}
