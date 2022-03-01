package com.lipkin.story.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="storylines")
public class Storyline {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@Column
	private String narrative;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getNarrative() {
		return narrative;
	}
	
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	
	public int getId() {
		return id;
	}
	
	
	

}
