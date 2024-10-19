package com.example.tilboard.repository;

import com.example.tilboard.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
