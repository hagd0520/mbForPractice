package com.ll.mbforpractice.domain.product.cart.service;

import com.ll.mbforpractice.domain.member.member.entity.Member;
import com.ll.mbforpractice.domain.product.cart.entity.CartItem;
import com.ll.mbforpractice.domain.product.cart.repository.CartRepository;
import com.ll.mbforpractice.domain.product.product.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CartService {
    private final CartRepository cartRepository;

    @Transactional
    public CartItem addItem(Member member, Product product) {
        CartItem cartItem = CartItem.builder()
                .member(member)
                .product(product)
                .build();

        cartRepository.save(cartItem);

        return cartItem;
    }
}
