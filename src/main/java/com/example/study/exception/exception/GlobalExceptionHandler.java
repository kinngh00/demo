package com.example.study.exception.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.study.exception.dto.ErrorResponseDto;
import com.example.study.exception.entity.ErrorCode;
import com.example.study.exception.exception.CustomException;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(CustomException.class)
  protected ResponseEntity<ErrorResponseDto> handlerCustomException(CustomException e) {
    ErrorCode errorCode = e.getErrorCode();

    return ResponseEntity
        .status(errorCode.getHttpStatus())
        .body(ErrorResponseDto.builder()
          .status(errorCode.getHttpStatus().value())
          .code(errorCode.name())
          .message(errorCode.getMessage())
          .build());
  }
}
