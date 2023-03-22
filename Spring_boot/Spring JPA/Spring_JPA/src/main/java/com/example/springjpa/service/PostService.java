package com.example.springjpa.service;

import com.example.springjpa.domain.Post;
import com.example.springjpa.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class PostService {

    private final PostRepository postRepository;

    public Post createdAPost(Post post) {

        if (post.getId() != null) {
            throw new RuntimeException("New post can not have an id");
        }

        Post result = postRepository.save(post);
        return result;
    }

    public List<Post> getListPost() {
        return postRepository.findAll();
    }


}
