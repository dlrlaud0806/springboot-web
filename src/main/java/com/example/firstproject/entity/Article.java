package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity //DB가 객체 인식 가능하도록!
@AllArgsConstructor
@ToString
public class Article {

    @Id // 대표값 지정
    @GeneratedValue // auto increment
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
