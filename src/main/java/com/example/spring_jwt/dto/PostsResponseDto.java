package com.example.spring_jwt.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsResponseDto {

    private String username;
    private String title;
    private String content;
    private LocalDateTime createdAt;

}
