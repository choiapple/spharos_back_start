package com.studybusan.mvc.Product.dto;

import com.studybusan.mvc.Product.model.ProductDetailImage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductDetailDto {
    private Long id;
    private String name;
    private int price;
    private String titleImgUrl;
    private String des;
    private String made;

    List<ProductDetailImage> productDetailImageList;
}
