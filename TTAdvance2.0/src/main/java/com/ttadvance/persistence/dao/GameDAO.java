package com.ttadvance.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttadvance.persistence.model.Game;

@Repository
public interface GameDAO extends JpaRepository<Game, Long>{

}
