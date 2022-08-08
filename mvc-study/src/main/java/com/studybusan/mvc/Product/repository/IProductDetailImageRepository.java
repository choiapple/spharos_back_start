package com.studybusan.mvc.Product.repository;

import com.studybusan.mvc.Product.model.Product;
import com.studybusan.mvc.Product.model.ProductDetailImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductDetailImageRepository extends JpaRepository<ProductDetailImage, Long> {
    List<ProductDetailImage> findAllByProductId(Long ProductId);
}
