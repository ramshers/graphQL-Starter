package me.exp.graphqljava.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Country {
	
	@Id
	String name;
	String population;
	

	public Country( ) { }
	
	public Country(String name, String population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
	
}
