package com.lipkin.story.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lipkin.story.exceptions.ResourceNotFoundException;

import com.lipkin.story.models.Storyline;

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
	
	@GetMapping("title/{id}")
	public ResponseEntity<Storyline> getTitleById(@PathVariable int id) {
		Storyline title = storylineRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Title not found."));
				return ResponseEntity.ok(title);
		
	}
	@PostMapping("add/title")
	public Storyline newTitle(@RequestBody Storyline title) {
		return storylineRepo.save(title);
	}
	public ResponseEntity<String> deleteTitle(@PathVariable int id) {
		storylineRepo.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("Title not found."));
		String message = "Title entry has been deleted.";
		storylineRepo.deleteById(id);
		return new ResponseEntity<>(message, HttpStatus.OK);
	
	}
	@PutMapping("title/{id}")
	public ResponseEntity<Storyline> updateTitle(@PathVariable int id, @RequestBody Storyline title) {
		Storyline foundTitle = storylineRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Title not found."));
		
		foundTitle.setTitle(title.getTitle());
		
		return ResponseEntity.ok(null);
		
	}

}
