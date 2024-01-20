package com.ll.mbforpractice.domain.cash.cash.service;

import com.ll.mbforpractice.domain.cash.cash.entity.CashLog;
import com.ll.mbforpractice.domain.cash.cash.repository.CashLogRepository;
import com.ll.mbforpractice.domain.member.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CashService {
    private final CashLogRepository cashLogRepository;

    @Transactional
    public CashLog addCash(Member member, long price, CashLog.EventType eventType) {
        CashLog cashLog = CashLog.builder()
                .member(member)
                .price(price)
                .relTypeCode(member.getModelName())
                .relId(member.getId())
                .eventType(eventType)
                .build();

        cashLogRepository.save(cashLog);

        return cashLog;
    }
}
