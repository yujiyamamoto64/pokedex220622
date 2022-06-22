package com.yujiyamamoto64.pokedex220622.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujiyamamoto64.pokedex220622.entities.PokemonType;
import com.yujiyamamoto64.pokedex220622.repositories.PokemonTypeRepository;

@Service
public class PokemonTypeService {

	@Autowired
	private PokemonTypeRepository repository;

	public List<PokemonType> findAll() {
		return repository.findAll();
	}

	public PokemonType findById(Long id) {
		Optional<PokemonType> obj = repository.findById(id);
		return obj.get();
	}
}