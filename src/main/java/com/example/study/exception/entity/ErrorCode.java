package com.example.study.exception.entity;

import org.springframework.http.HttpStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
  EMAIL_DUPLICATED(HttpStatus.CONFLICT, "이미 가입된 이메일입니다."),
  INVALID_PASSWORD_FORMAT(HttpStatus.BAD_REQUEST, "비밀번호 형식이 올바르지 않습니다."),

  SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류가 발생했습니다.");
  //HttpStatus 뒤에는 아무렇게나 지정이 아닌 실제로 SPRING에서 지정된거지?

  private final HttpStatus httpStatus;
  private final String message;
  //왜 이 두필드가 있어야 사용가능하며 열거형안에 내용이 메세지인것을 어떻게 자동으로 인식하는가?
}
