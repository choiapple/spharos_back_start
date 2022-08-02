package com.studybusan.mvc.Cart.dto;


import lombok.Data;

// 순수하게 프론트 단의 요청을 처리하기 위한 클래스
// 받아올 정보만 적으면 된다.
// Data 어노테이션을 선언하면 생성자, 게터, 세터 들을 알아서 설정한다.
@Data
public class CartDtoInput {

    private Long userId;
    private Long productId;
    private int qty;
}
