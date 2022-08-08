package com.studybusan.mvc.Product.service;

import com.studybusan.mvc.Product.dto.ProductDetailDto;

public interface IProductService {
    ProductDetailDto getProduct(Long productId);

}
