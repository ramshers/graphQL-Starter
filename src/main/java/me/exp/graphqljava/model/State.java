package me.exp.graphqljava.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;;

@Table
@Entity
public class State {

	@Id
	String name;

	String population;	

	//	@OneToMany(cascade=CascadeType.ALL)
	//    @JoinTable(name="STATE_CITY_JT", joinColumns={@JoinColumn(name="STATE_NAME", referencedColumnName="name")}
	//    , inverseJoinColumns={@JoinColumn(name="CITY_NAME", referencedColumnName="name")})
		
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="state")
	List<City> cities;

	@ManyToOne  
	Country Country;


	public State() { }

	public State(String name, String population,  Country country) {
		super();
		this.name = name;
		this.population = population;
		Country = country;
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

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country country) {
		Country = country;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}


}
