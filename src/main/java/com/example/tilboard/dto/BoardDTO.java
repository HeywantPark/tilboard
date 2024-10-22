package com.example.tilboard.dto;


import com.example.tilboard.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

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
    private MultipartFile boardFile; //save.html -> Controller 담는 용도
    private String originalFileName; // 원본 파일 이름
    private String storedFileName; // 서버 저장용 이름
    private int fileAttached; // 파일 첨부 여부

    public BoardDTO(Long id, String writer, String title, LocalDateTime createdAt) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.createdAt = createdAt;
    }

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
