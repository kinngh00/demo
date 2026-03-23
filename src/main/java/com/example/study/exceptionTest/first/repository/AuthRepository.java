package com.example.study.exceptionTest.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.exceptionTest.first.entity.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long> {

}
