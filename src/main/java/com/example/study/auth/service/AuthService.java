package com.example.study.auth.service;

import com.example.study.auth.repository.AuthRepository;
import com.example.study.auth.dto.AuthRequestDto;
import com.example.study.auth.dto.AuthResponseDto;
import com.example.study.auth.entity.Auth;
import com.example.study.auth.entity.UserRole;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

  private final AuthRepository authRepository;
  private final PasswordEncoder passwordEncoder;

  public AuthResponseDto createMember(AuthRequestDto authRequestDto) {

    String encodedPassword = passwordEncoder.encode(authRequestDto.getPassword());

    Auth auth = Auth.builder()
        .email(authRequestDto.getEmail())
        .password(encodedPassword)
        .name(authRequestDto.getName())
        .role(UserRole.USER)
        .build();

    Auth create = authRepository.save(auth);

    return new AuthResponseDto(create);
  }
}
