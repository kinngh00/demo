package com.example.study.test2.dto;

import lombok.Getter;
import com.example.study.test2.entity.Auth;

@Getter
public class GoogleAuthResponseDto {
  private final String name;

  public GoogleAuthResponseDto(Auth auth) {
    this.name = auth.getName();
  }
}
