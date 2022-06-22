package com.yujiyamamoto64.pokedex220622.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yujiyamamoto64.pokedex220622.entities.PokemonType;
import com.yujiyamamoto64.pokedex220622.services.PokemonTypeService;

@RestController
@RequestMapping(value = "/pokemonstype")
public class PokemonTypeResource {

	@Autowired
	private PokemonTypeService service;
	
	@GetMapping
	public ResponseEntity<List<PokemonType>> findAll() {
		List<PokemonType> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PokemonType> findById(@PathVariable Long id) {
		PokemonType obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
