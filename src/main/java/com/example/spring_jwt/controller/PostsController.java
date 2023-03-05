package com.example.spring_jwt.controller;

import com.example.spring_jwt.dto.PostsResponseDto;
import com.example.spring_jwt.entity.Posts;
import com.example.spring_jwt.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class PostsController {

    private final PostsService postsService;

    @GetMapping("/posts")
    public List<Posts> getPosts(PostsResponseDto postsResponseDto) {
        return postsService.getPosts(postsResponseDto);
    }
}
