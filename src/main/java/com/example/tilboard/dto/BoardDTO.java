package com.example.tilboard.dto;


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

}
