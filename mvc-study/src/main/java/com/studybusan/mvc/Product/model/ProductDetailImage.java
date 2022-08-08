package com.studybusan.mvc.Product.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductDetailImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imgUrl;
    private String imgTxt;

    @ManyToOne
    private Product product;
}
