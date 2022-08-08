package com.studybusan.mvc.Product.service;

import com.studybusan.mvc.Product.model.ProductDetailImage;

import java.util.List;

public interface IProductDetailImageService {
    List<ProductDetailImage> getAllByProductId(Long productId);

}
