package com.example.deploye.controller;


import com.example.deploye.model.Post;
import com.example.deploye.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/add")
    public Post AddPost(@RequestBody Post post){
       return  postService.addPost(post);
    }

    @GetMapping("/getAll/{id}")
    public Optional<Post> getPost(@PathVariable Long id){
        return postService.getPost(id);
    }

    @GetMapping("/getAll")
    public List<Post> getAll(){
        return postService.getAll();
    }
}
