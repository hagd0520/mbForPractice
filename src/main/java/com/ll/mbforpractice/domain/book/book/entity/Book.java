package com.ll.mbforpractice.domain.book.book.entity;

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
public class Book extends BaseEntity {
    @ManyToOne
    private Member author;
    private String title;
    private String body;
    private Long price;
}
