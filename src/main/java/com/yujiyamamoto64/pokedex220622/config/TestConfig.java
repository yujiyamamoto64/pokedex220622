package com.yujiyamamoto64.pokedex220622.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yujiyamamoto64.pokedex220622.entities.Pokemon;
import com.yujiyamamoto64.pokedex220622.entities.PokemonObj;
import com.yujiyamamoto64.pokedex220622.entities.PokemonType;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonObjRepository;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonRepository;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonTypeRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Autowired
	private PokemonTypeRepository pokemonTypeRepository;
	
	@Autowired
	private PokemonObjRepository pokemonObjRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pokemon pokemon1 = new Pokemon(null, "Bulbasaur");
		Pokemon pokemon2 = new Pokemon(null, "Ivysaur");
		Pokemon pokemon3 = new Pokemon(null, "Venusaur");
		
		PokemonType type1 = new PokemonType(null, "Grass");
		PokemonType type2 = new PokemonType(null, "Poison");
		
		PokemonObj pokemonobj2 = new PokemonObj(pokemon2);
		PokemonObj pokemonobj3 = new PokemonObj(pokemon3);
		
		pokemonRepository.saveAll(Arrays.asList(pokemon1, pokemon2, pokemon3));
		pokemonTypeRepository.saveAll(Arrays.asList(type1, type2));
		pokemonObjRepository.saveAll(Arrays.asList(pokemonobj2, pokemonobj3));
		
		pokemon1.getTypes().add(type1);
		pokemon1.getTypes().add(type2);
		
		pokemon2.getTypes().add(type1);
		pokemon2.getTypes().add(type2);
		
		pokemon3.getTypes().add(type1);
		pokemon3.getTypes().add(type2);
		
		pokemon1.getNext_evolution().add(pokemonobj2);
		pokemon1.getNext_evolution().add(pokemonobj3);
		
		pokemon2.getNext_evolution().add(pokemonobj3);
		
		pokemonRepository.saveAll(Arrays.asList(pokemon1, pokemon2, pokemon3));
		
	}
	
	
}
