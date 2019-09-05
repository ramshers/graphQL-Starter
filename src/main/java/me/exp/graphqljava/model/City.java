package me.exp.graphqljava.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class City {

		@Id
		String name;
		String population;
	   
		@ManyToOne 
		State state;
		
		public City() { }

		public City(String name, String population, State state) {
			super();
			this.name = name;
			this.population = population;
			this.state = state;
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

		public State getState() {
			return state;
		}

		public void setState(State state) {
			this.state = state;
		}
		
}
