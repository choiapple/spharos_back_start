package com.studybusan.mvc.Cart.service;

import com.studybusan.mvc.Cart.dto.CartDtoInput;
import com.studybusan.mvc.Cart.dto.CartDtoOutput;
import com.studybusan.mvc.Cart.model.Cart;
import com.studybusan.mvc.Cart.repository.ICartRepository;
import com.studybusan.mvc.Product.model.Product;
import com.studybusan.mvc.Product.repository.IProductRepository;
import com.studybusan.mvc.user.model.User;
import com.studybusan.mvc.user.repository.IUserRepository;
import com.studybusan.mvc.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartServiceImple implements ICartService{
    private final IUserRepository iUserRepository;

    private final IProductRepository iProductRepository;

    private final ICartRepository iCartRepository;

    @Override
    public Cart addCart(CartDtoInput cartDtoInput){
        Optional<Product> product = iProductRepository.findById(cartDtoInput.getProductId());
        Optional<User> user = iUserRepository.findById(cartDtoInput.getUserId());
        if(product.isPresent() && user.isPresent()){
            return iCartRepository.save( Cart.builder()
                            .product(product.get())
                            .user(user.get())
                            .qty(cartDtoInput.getQty())
                            .build()
            );
        }
        return null;
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
        Optional<Cart> cart = iCartRepository.findById(id);
        if(cart.isPresent()){
            return CartDtoOutput.builder()
                    .id(cart.get().getId())
                    .productName(cart.get().getProduct().getName())
                    .qty(cart.get().getQty())
                    .price(cart.get().getProduct().getPrice())
                    .build();
            }
        return null;
    }
}
