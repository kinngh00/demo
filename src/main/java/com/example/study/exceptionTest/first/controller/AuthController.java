package com.example.study.exceptionTest.first.controller;

import com.example.study.exceptionTest.first.entity.Auth;
import com.example.study.exceptionTest.first.service.AuthService;
import com.example.study.exceptionTest.first.dto.AuthLocalResponseDto;
import com.example.study.exceptionTest.first.dto.AuthLocalRequestDto;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private final AuthService authService;

  public AuthController(AuthService authService) {
    this.authService = authService;
  }

  @PostMapping
  public AuthLocalResponseDto createMember(@RequestBody AuthLocalRequestDto authLocalRequestDto) {
    return authService.createLocalMember(authLocalRequestDto);
  }
}
