package com.example.springdoc.swagger.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ct")

public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String content;
    private LocalDateTime dateSaver;

    @ManyToOne
    @JoinColumn(name="boardId")
    @JsonBackReference
    private BoardEntity boardEntity;

    public void setBoard(BoardEntity boardEntity) {
        this.boardEntity = boardEntity;
    }

}
