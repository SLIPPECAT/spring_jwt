package com.example.spring_jwt.entity;


import com.example.spring_jwt.dto.PostsResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@RequiredArgsConstructor
@Getter
@Entity
public class Posts extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String user_id;

    @Column(nullable = false)
    private String user_pw;

    @Column(nullable = false)
    private String content;

    public Posts(PostsResponseDto postsResponseDto) {
        this.username = postsResponseDto.getUsername();
        this.content = postsResponseDto.getContent();
        this.title = postsResponseDto.getTitle();

    }
}
