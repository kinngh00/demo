package com.example.study.day7.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.example.study.day7.first.entity.Post;
import com.example.study.day7.first.repository.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {
  private final PostRepository postRepository;

  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @PostMapping
  public Post post(@RequestBody Post post) {
    return postRepository.save(post);
  }

  @GetMapping
  public List<Post> getAllPost() {
    return postRepository.findAll();
  }

  @GetMapping("/{id}")
  public Post getPost(@PathVariable Long id) {
    return postRepository.findById(id).orElseThrow();
  }

  @PutMapping("/{id}")
  public Post updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
    Post post = postRepository.findById(id).orElseThrow();
    post.setTitle(updatedPost.getTitle());
    post.setContent(updatedPost.getContent());
    return postRepository.save(post);
  }

  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable Long id) {
    postRepository.deleteById(id);
  }
}
