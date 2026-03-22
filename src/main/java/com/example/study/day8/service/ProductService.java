package com.example.study.day8.service;

import org.springframework.stereotype.Service;
import com.example.study.day8.repository.ProductRepository;
import com.example.study.day8.entity.Product;
import com.example.study.day8.dto.ProductRequestDto;
import com.example.study.day8.dto.ProductResponseDto;
import com.example.study.day8.dto.ProductUpdateRequestDto;

@Service
public class ProductService {
  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductResponseDto updateProduct(Long id, ProductUpdateRequestDto updateProductDto) {
    Product product = productRepository.findById(id).orElseThrow();
    product.setPrice(updateProductDto.getPrice());
    product.setCategory(updateProductDto.getCategory());
    Product saveProduct = productRepository.save(product);

    return new ProductResponseDto(saveProduct);
  }
}
