package com.example.study.test2.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auth {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false) // 구글 로그인 대비
  private String email;

  private String password;

  private String name;

  @Enumerated(EnumType.STRING)
  private AuthProvider provider;

  @Enumerated(EnumType.STRING)
  private UserRole role;

  @CreationTimestamp
  @Column(updatable = false)
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;
}
