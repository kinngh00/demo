package com.example.study.exception.exception;

import lombok.Getter;
import lombok.Builder;
import com.example.study.exception.entity.ErrorCode;

@Getter
@Builder
public class CustomException extends RuntimeException {
  private final ErrorCode errorCode;
}
