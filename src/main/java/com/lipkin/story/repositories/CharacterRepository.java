package com.lipkin.story.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lipkin.story.models.Characters;

@Repository
public interface CharacterRepository extends JpaRepository<Characters, Integer> {

}
