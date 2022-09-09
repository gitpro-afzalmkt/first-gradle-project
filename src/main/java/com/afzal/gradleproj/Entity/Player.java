package com.afzal.gradleproj.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player {
	
		@Id
		private int id;
		private String name;
		private int runs;
		
		
		public Player() {
			super();
		}


		public Player(int id, String name, int runs) {
			super();
			this.id = id;
			this.name = name;
			this.runs = runs;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getRuns() {
			return runs;
		}


		public void setRuns(int runs) {
			this.runs = runs;
		}
		
		
		
}
