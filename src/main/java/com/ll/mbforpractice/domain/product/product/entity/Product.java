package com.ll.mbforpractice.domain.product.product.entity;

import com.ll.mbforpractice.domain.member.member.entity.Member;
import com.ll.mbforpractice.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
@ToString(callSuper = true)
public class Product extends BaseEntity {
    @ManyToOne
    private Member maker;
    private String relTypeCode; // 상품명
    private Long relId; // 해당 상품의 id 값
    private String name;
    private Long price;
}
