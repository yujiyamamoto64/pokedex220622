package com.yujiyamamoto64.pokedex220622.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yujiyamamoto64.pokedex220622.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
