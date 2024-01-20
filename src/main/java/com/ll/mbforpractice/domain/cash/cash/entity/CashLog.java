package com.ll.mbforpractice.domain.cash.cash.entity;

import com.ll.mbforpractice.domain.member.member.entity.Member;
import com.ll.mbforpractice.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class CashLog extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    @ManyToOne
    private Member member;
    private String relTypeCode;
    private Long relId;
    private Long price;

    public enum EventType {
        충전__무통장입금,
        충전__토스페이먼츠,
        충전__통장입금,
        사용__토스페이먼츠_주문결제,
        사용__예치금_주문결제,
        환불__예치금_주문결제,
        작가정산__예치금;
    }
}
