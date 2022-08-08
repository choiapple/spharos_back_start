package com.studybusan.mvc.Product.service;

import com.studybusan.mvc.Product.dto.ProductDetailDto;
import com.studybusan.mvc.Product.model.Product;
import com.studybusan.mvc.Product.repository.IProductDetailImageRepository;
import com.studybusan.mvc.Product.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImple implements IProductService{
    private final IProductRepository iProductRepository;
    private final IProductDetailImageRepository iProductDetailImageRepository;

    @Override
    public ProductDetailDto getProduct(Long productId){
        Optional<Product> product = iProductRepository.findById(productId);
        if(product.isPresent()){
            ProductDetailDto.builder()
                    .id(product.get().getId())
                    .name(product.get().getName())
                    .price(product.get().getPrice())
                    .made(product.get().getMade())
                    .titleImgUrl(product.get().getTitleImgUrl())
                    .des(product.get().getDes())
                    .productDetailImageList(iProductDetailImageRepository.findAllByProductId(productId))
                    .build();
        }
        return null;
    }


}
