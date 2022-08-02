package com.studybusan.mvc.Product.repository;

import com.studybusan.mvc.Product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
