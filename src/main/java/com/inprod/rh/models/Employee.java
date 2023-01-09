package com.inprod.rh.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee extends User {
		private int soldeConge; 
		
	public int getSoldeConge() {
			return soldeConge;
		}

		public void setSoldeConge(int soldeConge) {
			this.soldeConge = soldeConge;
		}

	public Employee() {
		super();
		
		this.setSoldeConge(42);
		// TODO Auto-generated constructor stub
	}

}
