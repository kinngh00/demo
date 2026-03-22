package com.example.study.day7.first.repository;

import com.example.study.day7.first.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}