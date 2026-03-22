package com.example.study.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TestController {
  @GetMapping("/test")
  public String test() {
    return "Test Success";
  }
}
