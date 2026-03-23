package com.example.study.exception.dto;

import lombok.Getter;
import lombok.Builder;

@Getter
@Builder
//Builder는 get~~ set~~ 이런거 안 해도 알아서 값 다 넣어주는거지? 생성자로?
public class ErrorResponseDto {
  private final int status;
  private final String code;
  private final String message;

  //status는 뭐고 code는 뭐야? 그리고 code는 왜 int가 아닌 string이야?
}
