package com.example.study.day7.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.day7.second.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> { }
