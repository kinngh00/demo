package com.example.study.test1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.study.test1.dto.ProductRequestDto;
import com.example.study.test1.dto.ProductResponseDto;
import com.example.study.test1.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  } // 생성자 없이도 아래 메서드 작동 되는데 왜 되는거야? 생성자가 없으면 빈깡통이라 기능도 작동 안 된다고 했잖아.

  @PostMapping
  public ProductResponseDto createProduct(@RequestBody ProductRequestDto newProduct) {
    return productService.createProduct(newProduct);
  }
}
