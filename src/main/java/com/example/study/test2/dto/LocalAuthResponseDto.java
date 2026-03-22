package com.example.study.test2.dto;

import lombok.Getter;
import com.example.study.test2.entity.Auth;

@Getter
public class LocalAuthResponseDto {
  private final String email;
  private final String name;

  public LocalAuthResponseDto(Auth response) {
    this.email = response.getEmail();
    this.name = response.getName();
  }
}
