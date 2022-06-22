package com.yujiyamamoto64.pokedex220622.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_pokemonobj")
public class PokemonObj implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "next_evolution")
	private List<Pokemon> pokemonsnext = new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "pre_evolution")
	private List<Pokemon> pokemonspre = new ArrayList<>();
	
	public PokemonObj() {
	}
	
	public PokemonObj(Pokemon pokemon) {
		super();
		this.id = pokemon.getId();
		this.name = pokemon.getName();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
