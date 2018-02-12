package com.ttadvance.persistence.dao;

import com.ttadvance.persistence.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDAO extends JpaRepository<Card, Long> {
}
