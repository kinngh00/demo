package com.example.study.test2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.study.test2.dto.AuthRequestDto;
import com.example.study.test2.dto.LocalAuthResponseDto;
import com.example.study.test2.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private AuthService authService;

  @PostMapping("/{provider}")
  public LocalAuthResponseDto createMember(@PathVariable String provider, @RequestBody AuthRequestDto authRequestDto) {
    if(provider.equals("LOCAL")) {
      return authService.createLocal(authRequestDto);
    }

    return authService.createGoogle(authRequestDto);
  }
}
