package com.example.study.test2.dto;

import lombok.Getter;

@Getter
public class GoogleAuthResponseDto {
  private final String name;

  public GoogleAuthResponseDto(Auth response) {
    this.name = response.getName();
  }
}
