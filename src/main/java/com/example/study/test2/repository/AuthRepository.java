package com.example.study.test2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.test2.entity.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long> { }
