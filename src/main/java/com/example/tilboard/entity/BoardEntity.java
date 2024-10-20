package com.example.tilboard.entity;

import com.example.tilboard.dto.BoardDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "tilBoard_table")
public class BoardEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 20, nullable = false) // 크기는 20, not null
    private String writer;

    @Column
    private String boardPass;

    @Column
    private String title;

    @Column
    private String content;

    public static BoardEntity tosaveEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity();

        boardEntity.setWriter(boardDTO.getWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setTitle(boardDTO.getTitle());
        boardEntity.setContent(boardDTO.getContent());
        return boardEntity;
    }

    public static BoardEntity toUpdateEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity();

        boardEntity.setId(boardDTO.getId());
        boardEntity.setWriter(boardDTO.getWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setTitle(boardDTO.getTitle());
        boardEntity.setContent(boardDTO.getContent());
        return boardEntity;
    }
}
