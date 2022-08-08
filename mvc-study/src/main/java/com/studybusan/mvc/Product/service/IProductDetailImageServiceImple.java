package com.studybusan.mvc.Product.service;

import com.studybusan.mvc.Product.model.ProductDetailImage;
import com.studybusan.mvc.Product.repository.IProductDetailImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IProductDetailImageServiceImple implements IProductDetailImageService{

    private final IProductDetailImageRepository iProductDetailImageRepository;

    @Override
    public List<ProductDetailImage> getAllByProductId(Long productId){
        return iProductDetailImageRepository.findAllByProductId(productId);
    }
}
