package com.yujiyamamoto64.pokedex220622.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yujiyamamoto64.pokedex220622.entities.Pokemon;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private PokemonRepository pokemonRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pokemon pokemon1 = new Pokemon(null, "Bulbasaur");
		Pokemon pokemon2 = new Pokemon(null, "Ivysaur");
		Pokemon pokemon3 = new Pokemon(null, "Venusaur");
		
		
		pokemonRepository.saveAll(Arrays.asList(pokemon1, pokemon2, pokemon3));
		
	}
	
	
}
