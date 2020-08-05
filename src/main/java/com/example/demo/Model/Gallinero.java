package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gallinero {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@OneToMany
	private List <Gallina> listaDeGallinas;


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

	public List<Gallina> getListaDeGallinas() {
		return listaDeGallinas;
	}

	public void setListaDeGallinas(List<Gallina> listaDeGallinas) {
		this.listaDeGallinas = listaDeGallinas;
	}
	

}
