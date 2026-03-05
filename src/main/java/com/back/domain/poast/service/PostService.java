package com.back.domain.poast.service;

import com.back.domain.poast.entity.Post;
import com.back.domain.poast.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public Post write(String title, String content) {
        Post post = new Post(title,content);
        return postRepository.save(post);
    }

    public long count() {
        return postRepository.count();
    }
}
