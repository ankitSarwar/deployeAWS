package com.example.deploye.service;


import com.example.deploye.model.Post;
import com.example.deploye.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    public Post addPost(Post post) {
        return postRepo.save(post);
    }


    public Optional<Post> getPost(Long id) {
        return postRepo.findById(id);
    }

    public List<Post> getAll() {
        return postRepo.findAll();
    }
}
