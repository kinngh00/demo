package com.example.study.day8.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.study.day8.service.ProductService;
import com.example.study.day8.dto.ProductResponseDto;
import com.example.study.day8.dto.ProductUpdateRequestDto;

@RestController
@RequestMapping("/api/product")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }
  @PutMapping("/{id}")
  public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductUpdateRequestDto data) {
    return productService.updateProduct(id, data);
  }
}
