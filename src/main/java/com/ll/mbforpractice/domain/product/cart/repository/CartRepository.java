package com.ll.mbforpractice.domain.product.cart.repository;

import com.ll.mbforpractice.domain.product.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartItem, Long> {
}
