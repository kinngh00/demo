package com.example.study.exceptionTest.first.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auth {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = true, unique = true)
  private String email;
  //구글 로그인 대비해서 이메일 null 허용

  @Column(nullable = false)
  private String password;
  //구글 로그인시 비밀번호가 넘어오는지 모르겠으나 비밀번호가 없으면 보안상 문제가 발생하므로 null 불허용

  @Column(nullable = false)
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private AuthProvider authProvider;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private UserRole role;

  @CreationTimestamp
  @Column(nullable = false, updatable = false)
  private LocalDateTime createdTime;

  @UpdateTimestamp
  @Column(nullable = false)
  private LocalDateTime updatedTime;
}
