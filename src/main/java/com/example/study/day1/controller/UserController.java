package com.example.study.day1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
  @GetMapping("/user")
  public String userList() {
    return "User List";
  }

  @GetMapping("/user/detail")
  public String userDetail() {
    return "User Detail";
  }
}