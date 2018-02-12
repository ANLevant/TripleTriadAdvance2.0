package com.ttadvance.persistence.dao;

import com.ttadvance.persistence.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckDAO extends JpaRepository<Deck, Long> {
}
