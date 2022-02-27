package com.lipkin.story.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="characters")
public class Characters {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String childname;
	@Column
	private String parent1;
	@Column
	private String parent2;
	@Column
	private String donor1;
	@Column
	private String donor2;
	
	public int getId() {
		return id;
	}
	
	public String getChildname() {
		return childname;
	}
	
	public void setChildname(String childname) {
		this.childname = childname;
	}
	
	public String getParent1() {
		return parent1;
	}
	
	public void setParent1(String parent1) {
		this.parent1 = parent1;
	}
	
	public String getParent2() {
		return parent2;
	}
	
	public void setParent2(String parent2) {
		this.parent2 = parent2;
	}
	
	public String getDonor1() {
		return donor1;
	}
	
	public void setDonor1(String donor1) {
		this.donor1 = donor1;
	}
	
	public String getDonor2() {
		return donor2;
	}
	
	public void setDonor2(String donor2) {
		this.donor2 = donor2;
	}
	
	
	
	
	
}
