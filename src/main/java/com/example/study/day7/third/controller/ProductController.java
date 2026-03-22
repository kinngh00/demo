package com.example.study.day7.third.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.example.study.day7.third.repository.ProductRepository;
import com.example.study.day7.third.entity.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  private final ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @PostMapping
  public Product createProduct(@RequestBody Product product) {
    return productRepository.save(product);
  }

  @GetMapping("/{id}")
  public Product getProduct(@PathVariable Long id) {
    return productRepository.findById(id).orElseThrow();
  }

  @GetMapping
  public List<Product> allProduct(@RequestParam(required = false) String category) {
    if(category == null) {
      return productRepository.findAll();
    }
    return productRepository.findByCategory(category);
  }

  @PutMapping("/{id}")
  public Product putProduct(@RequestBody Product updateProduct, @PathVariable Long id) {
    Product product = productRepository.findById(id).orElseThrow();
    product.setPrice(updateProduct.getPrice());
    product.setCategory(updateProduct.getCategory());

    return productRepository.save(product);
  }

  @DeleteMapping("/{id}")
  public void deleteProduct(@PathVariable Long id) {
    productRepository.deleteById(id);
  }
}
