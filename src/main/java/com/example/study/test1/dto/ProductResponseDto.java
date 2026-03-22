package com.example.study.test1.dto;

import lombok.Getter;
import com.example.study.test1.entity.Product;

@Getter
public class ProductResponseDto {
  private final String name;
  private final int price;

  public ProductResponseDto(Product product) {
    this.name = product.getName();
    this.price = product.getPrice();
  }
}
