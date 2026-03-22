package com.example.study.day2.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.study.day2.dto.User;
import com.example.study.day2.dto.Calc;

@RestController
public class PostController {
  @PostMapping("/user/create")
  public String createUser(@RequestBody User user) {
    return user.getName() + "생성 완료";
  }

  @PostMapping("/user/info")
  public String userInfo(@RequestBody User user) {
    return "이름 : " + user.getName() + ", 나이 : " + user.getAge();
  }

  @PostMapping("/user/calc")
  public int add(@RequestBody Calc calc) {
    return calc.add();
  }
}
