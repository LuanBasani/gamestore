package com.luanbasani.gamestore.Repository;

import org.springframework.data.repository.CrudRepository;

import com.luanbasani.gamestore.Model.Game;

public interface GameRepository extends CrudRepository<Game, Integer> {
    
}
