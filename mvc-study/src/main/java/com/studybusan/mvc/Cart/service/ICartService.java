package com.studybusan.mvc.Cart.service;

import com.studybusan.mvc.Cart.dto.CartDtoInput;
import com.studybusan.mvc.Cart.dto.CartDtoOutput;
import com.studybusan.mvc.Cart.model.Cart;

import java.util.List;

public interface ICartService {

    Cart addCart(CartDtoInput cartDtoInput);
    List<CartDtoOutput> getAll();

    CartDtoOutput getCartById(Long id);
}
