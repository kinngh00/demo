package com.example.study.day8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.day8.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
