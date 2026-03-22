package com.example.study.day8.dto;

import lombok.Getter;
import com.example.study.day8.entity.Product;

@Getter
public class ProductResponseDto {
  private Long id;
  private String name;
  private String category;
  private int price;

  public ProductResponseDto(Product product) {
    this.id = product.getId();
    this.name = product.getName();
    this.category = product.getCategory();
    this.price = product.getPrice();
  }
}
