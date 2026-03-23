package com.example.study.exceptionTest.first.dto;

import lombok.Getter;
import lombok.Builder;
import com.example.study.exceptionTest.first.entity.Auth;

@Getter
public class AuthResponseLocalDto {
  private final String email;
  private final String name;

  public AuthResponseLocalDto(Auth auth) {
    this.email = auth.getEmail();
    this.name = auth.getName();
  }
}
