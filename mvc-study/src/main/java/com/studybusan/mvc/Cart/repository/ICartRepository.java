package com.studybusan.mvc.Cart.repository;

import com.studybusan.mvc.Cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<Cart, Long> {
}
