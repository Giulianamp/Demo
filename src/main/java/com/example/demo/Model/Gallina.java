package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gallina {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int huevos;

	
	//GETTERS Y SETTERS
	
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
	public int getHuevos() {
		return huevos;
	}
	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}

}
