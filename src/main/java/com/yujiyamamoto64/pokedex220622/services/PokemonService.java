package com.yujiyamamoto64.pokedex220622.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujiyamamoto64.pokedex220622.entities.Pokemon;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	private PokemonRepository repository;

	public List<Pokemon> findAll() {
		return repository.findAll();
	}

	public Pokemon findById(Long id) {
		Optional<Pokemon> obj = repository.findById(id);
		return obj.get();
	}
}