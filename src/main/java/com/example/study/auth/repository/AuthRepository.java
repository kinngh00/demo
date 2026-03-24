package com.example.study.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.auth.entity.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long> {

}
