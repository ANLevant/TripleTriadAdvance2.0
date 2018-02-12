package com.ttadvance.persistence.dao;

import com.ttadvance.persistence.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Long> {
}
