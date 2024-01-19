package com.ll.mbforpractice.domain.product.cart.entity;

import com.ll.mbforpractice.domain.member.member.entity.Member;
import com.ll.mbforpractice.domain.product.product.entity.Product;
import com.ll.mbforpractice.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Getter
@Setter
@Builder
@ToString(callSuper = true)
public class CartItem extends BaseEntity {
    @ManyToOne
    private Member member;
    @ManyToOne
    private Product product;
}
