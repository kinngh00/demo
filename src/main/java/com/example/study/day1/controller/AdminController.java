package com.example.study.day1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AdminController {
  @GetMapping("/admin")
  public String adminPage() {
    return "Admin Page";
  }
}
