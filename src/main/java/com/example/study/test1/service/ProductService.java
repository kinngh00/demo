package com.example.study.test1.service;

import org.springframework.stereotype.Service;
import com.example.study.test1.repository.ProductRepository;
import com.example.study.test1.entity.Product;
import com.example.study.test1.dto.ProductRequestDto;
import com.example.study.test1.dto.ProductResponseDto;

@Service
public class ProductService {
  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductResponseDto createProduct(ProductRequestDto request) {
    Product product = new Product();

    if(request.getStock() <= 0) {
      throw new IllegalArgumentException("재고는 최소 1개 이상이어야 합니다.");
    }

    product.setName(request.getName());
    product.setPrice(request.getPrice());
    product.setStock(request.getStock());
    product.setCategory(request.getCategory());

    Product test = productRepository.save(product);

    return new ProductResponseDto(test);
  }
}
