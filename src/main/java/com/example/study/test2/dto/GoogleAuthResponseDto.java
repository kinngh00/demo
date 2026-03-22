package com.example.study.test2.dto;

import lombok.Getter;

@Getter
public class GoogleAuthResponseDto {
  private String name;

  public GoogleAuthResponseDto(GoogleAuthResponseDto response) {
    this.name = response.getName();
  }
}
