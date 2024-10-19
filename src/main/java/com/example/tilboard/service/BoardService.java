package com.example.tilboard.service;

import com.example.tilboard.dto.BoardDTO;
import com.example.tilboard.entity.BoardEntity;
import com.example.tilboard.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


// DTO -> Entity
// Entity -> DTO

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.tosaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
