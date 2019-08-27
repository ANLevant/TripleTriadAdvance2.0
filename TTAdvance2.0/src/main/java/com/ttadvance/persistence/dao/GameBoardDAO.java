package com.ttadvance.persistence.dao;

import com.ttadvance.persistence.model.GameBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameBoardDAO extends JpaRepository<GameBoard, Long> {
}
