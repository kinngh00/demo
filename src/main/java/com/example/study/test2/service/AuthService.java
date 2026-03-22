package com.example.study.test2.service;

import org.springframework.stereotype.Service;
import com.example.study.test2.entity.Auth;
import com.example.study.test2.entity.AuthProvider;
import com.example.study.test2.entity.UserRole;
import com.example.study.test2.repository.AuthRepository;
import com.example.study.test2.dto.AuthRequestDto;
import com.example.study.test2.dto.LocalAuthResponseDto;
import com.example.study.test2.dto.GoogleAuthResponseDto;

@Service
public class AuthService {
  private final AuthRepository authRepository;

  public AuthService(AuthRepository authRepository) {
    this.authRepository = authRepository;
  }

  public LocalAuthResponseDto createLocal(AuthRequestDto request) {
    Auth auth = new Auth();

    auth.setEmail(request.getEmail());
    auth.setPassword(request.getPassword());
    auth.setName(request.getName());
    auth.setProvider(AuthProvider.LOCAL);
    auth.setRole(UserRole.USER);

    Auth newMember = authRepository.save(auth);

    return new LocalAuthResponseDto(newMember);
  }

  public GoogleAuthResponseDto createGoogle(AuthRequestDto request) {
    Auth auth = new Auth();

     //구글은 이메일 어떻게하는지 몰라서 일단 이렇게만 함. 구글 로그인 구현을 모르겠어서 그냥 흉내만 냄.
    auth.setPassword(request.getPassword());
    auth.setName(request.getName());
    auth.setProvider(AuthProvider.GOOGLE);
    auth.setRole(UserRole.USER);

    Auth newMember = authRepository.save(auth);

    return new GoogleAuthResponseDto(newMember);
  }
}
