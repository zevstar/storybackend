package com.lipkin.story.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lipkin.story.models.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

	List<Character> findByChildname(String childname);

}
