package com.inprod.rh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONGE")
public class Conge {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id ; 
		private int duree ; 
		private String typeDeConge;
		private String description ; 
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public int getDuree() {
			return duree;
		}
		public void setDuree(int duree) {
			this.duree = duree;
		}
		public String getTypeDeConge() {
			return typeDeConge;
		}
		public void setTypeDeConge(String typeDeConge) {
			this.typeDeConge = typeDeConge;
		}
		
		
}
