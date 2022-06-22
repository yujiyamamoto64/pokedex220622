package com.yujiyamamoto64.pokedex220622.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yujiyamamoto64.pokedex220622.entities.Pokemon;
import com.yujiyamamoto64.pokedex220622.entities.PokemonType;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonRepository;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonTypeRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Autowired
	private PokemonTypeRepository pokemonTypeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pokemon pokemon1 = new Pokemon(null, "Bulbasaur");
		Pokemon pokemon2 = new Pokemon(null, "Ivysaur");
		Pokemon pokemon3 = new Pokemon(null, "Venusaur");
		
		PokemonType type1 = new PokemonType(null, "Grass");
		PokemonType type2 = new PokemonType(null, "Poison");
		
		pokemonRepository.saveAll(Arrays.asList(pokemon1, pokemon2, pokemon3));
		pokemonTypeRepository.saveAll(Arrays.asList(type1, type2));
		
		pokemon1.getTypes().add(type1);
		pokemon1.getTypes().add(type2);
		
		pokemon2.getTypes().add(type1);
		pokemon2.getTypes().add(type2);
		
		pokemon3.getTypes().add(type1);
		pokemon3.getTypes().add(type2);
		
		pokemonRepository.saveAll(Arrays.asList(pokemon1, pokemon2, pokemon3));
		
	}
	
	
}
