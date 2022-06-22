package com.yujiyamamoto64.pokedex220622.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yujiyamamoto64.pokedex220622.entities.Pokemon;

@RestController
@RequestMapping(value = "/pokemons")
public class PokemonResource {

	@GetMapping
	public ResponseEntity<Pokemon> findAll() {
		Pokemon pokemon1 = new Pokemon(1L, "Bulbasaur");
		return ResponseEntity.ok().body(pokemon1);
	}
}
