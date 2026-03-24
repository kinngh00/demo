package com.example.study.auth.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import lombok.RequiredArgsConstructor;
import com.example.study.auth.dto.AuthRequestDto;
import com.example.study.auth.dto.AuthResponseDto;
import com.example.study.auth.service.AuthService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

  private final AuthService authService;

  @PostMapping
  public AuthResponseDto createMember(AuthRequestDto authRequestDto) {
    return authService.createMember(authRequestDto);
  }
}
