package com.example.study.test2.dto;

import lombok.Getter;
import com.example.study.test2.entity.Auth;

@Getter
public class LocalAuthResponseDto {
  private final String email;
  private final String name;

  public LocalAuthResponseDto(Auth auth) {
    this.email = auth.getEmail();
    this.name = auth.getName();
  }
}
