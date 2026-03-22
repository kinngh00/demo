package com.example.study.test2.dto;

import com.example.study.test2.entity.AuthProvider;
import com.example.study.test2.entity.UserRole;
import lombok.Getter;

@Getter
public class AuthRequestDto {
  private String email;
  private String password;
  private String name;
  private AuthProvider provider;
  private UserRole role;
}
