package com.example.study.exceptionTest.first.service;

import com.example.study.exceptionTest.first.repository.AuthRepository;
import com.example.study.exceptionTest.first.dto.AuthLocalResponseDto;
import com.example.study.exceptionTest.first.dto.AuthLocalRequestDto;
import com.example.study.exceptionTest.first.entity.Auth;
import com.example.study.exceptionTest.first.entity.UserRole;
import com.example.study.exceptionTest.first.entity.AuthProvider;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
  private final AuthRepository authRepository;

  public AuthLocalResponseDto createLocalMember(AuthLocalRequestDto authLocalRequestDto) {
    Auth auth = Auth.builder()
        .email(authLocalRequestDto.getEmail())
        .name(authLocalRequestDto.getName())
        .password(authLocalRequestDto.getPassword()) //추후 인코딩 추가
        .authProvider(AuthProvider.LOCAL)
        .role(UserRole.USER)
        .build();

    Auth saveLocalMember = authRepository.save(auth);
    return new AuthLocalResponseDto(saveLocalMember);
  }
  
  //추후 구글 가입 구현 예정
}
