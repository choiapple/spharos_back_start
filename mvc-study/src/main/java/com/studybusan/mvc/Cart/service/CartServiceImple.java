package com.studybusan.mvc.Cart.service;

import com.studybusan.mvc.Cart.dto.CartDtoInput;
import com.studybusan.mvc.Cart.dto.CartDtoOutput;
import com.studybusan.mvc.Cart.model.Cart;
import com.studybusan.mvc.Cart.repository.ICartRepository;
import com.studybusan.mvc.Product.repository.IProductRepository;
import com.studybusan.mvc.user.repository.IUserRepository;
import com.studybusan.mvc.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImple implements ICartService{
    private final IUserRepository iUserRepository;

    private final IProductRepository iProductRepository;

    private final ICartRepository iCartRepository;

    @Override
    public Cart addCart(CartDtoInput cartDtoInput){
        return iCartRepository.save(
                Cart.builder()
                        .product(iProductRepository.findById(cartDtoInput.getProductId()).get())
                        .user(iUserRepository.findById(cartDtoInput.getUserId()).get())
                        .qty(cartDtoInput.getQty())
                        .build()
        );
    }

    @Override
    public List<CartDtoOutput> getAll(){
//        List<Cart> cartList = iCartRepository.findAll();
//        List<CartDtoOutput> cartDtoOutputList = new ArrayList<>();
//        return cartList.stream().map(cart-> {
//            cartDtoOutputList.add(
//                    CartDtoOutput.builder()
//                            .id(cart.getId())
//                            .productName(cart.getProduct().getName())
//                            .qty(cart.getQty())
//                            .price(cart.getProduct().getPrice())
//                            .build()
//            );
//        });
        return null;
    }

    @Override
    public CartDtoOutput getCartById(Long id){
        Cart cart = iCartRepository.findById(id).get();
        return CartDtoOutput.builder()
                .id(cart.getId())
                .productName(cart.getProduct().getName())
                .qty(cart.getQty())
                .price(cart.getProduct().getPrice())
                .build();
    }
}
