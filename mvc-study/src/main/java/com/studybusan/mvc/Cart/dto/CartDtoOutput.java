package com.studybusan.mvc.Cart.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDtoOutput {
    private Long id;
    private String productName;
    private int price;
    private int qty;
}
