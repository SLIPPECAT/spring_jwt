package com.example.spring_jwt.service;

import com.example.spring_jwt.dto.PostsResponseDto;
import com.example.spring_jwt.entity.Posts;
import com.example.spring_jwt.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public List<Posts> getPosts(PostsResponseDto postsResponseDto){

        return postsRepository.findAll();
    }
}
