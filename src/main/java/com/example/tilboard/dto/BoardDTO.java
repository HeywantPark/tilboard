package com.example.tilboard.dto;


import com.example.tilboard.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private String title;
    private String boardPass;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static BoardDTO toboardDTO(BoardEntity boardEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setTitle(boardEntity.getTitle());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setContent(boardEntity.getContent());
        boardDTO.setWriter(boardEntity.getWriter());
        boardDTO.setCreatedAt(boardEntity.getCreatedAt());
        boardDTO.setUpdatedAt(boardEntity.getUpdatedAt());
        return boardDTO;
    }
}
