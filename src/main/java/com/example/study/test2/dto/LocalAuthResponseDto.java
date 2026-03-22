package com.example.study.test2.dto;

import lombok.Getter;

@Getter
public class LocalAuthResponseDto {
  private final String email;
  private final String name;

  public LocalAuthResponseDto(LocalAuthResponseDto response) {
    this.email = response.getEmail();
    this.name = response.getName();
  }
}
