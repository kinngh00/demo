package com.example.study.day1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalcController {
  @GetMapping("/calc")
  public String result(@RequestParam String op, @RequestParam int a, @RequestParam int b) {
    if(op.equals("add")) {
      return String.valueOf(a + b);
    } else if(op.equals("sub")) {
      return String.valueOf(a - b);
    } else if(op.equals("mul")) {
      return String.valueOf(a * b);
    } else if(op.equals("div")) {
      if(b == 0) {
        return "cannot divide by zero";
      }
      return String.valueOf(a / b);
    }

    return "invalid operation";
  }
}
