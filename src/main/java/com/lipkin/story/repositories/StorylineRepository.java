package com.lipkin.story.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lipkin.story.models.Storyline;


@Repository
public interface StorylineRepository extends JpaRepository<Storyline, Integer> {

}
