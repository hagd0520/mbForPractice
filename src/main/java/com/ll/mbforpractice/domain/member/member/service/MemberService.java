package com.ll.mbforpractice.domain.member.member.service;

import com.ll.mbforpractice.domain.cash.cash.entity.CashLog;
import com.ll.mbforpractice.domain.cash.cash.service.CashService;
import com.ll.mbforpractice.domain.member.member.entity.Member;
import com.ll.mbforpractice.domain.member.member.repository.MemberRepository;
import com.ll.mbforpractice.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final CashService cashService;

    @Transactional
    public RsData<Member> join(String username, String password) {
        Member member = Member.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();

        memberRepository.save(member);

        return RsData.of("200", "회원가입 성공", member);
    }

    public Optional<Member> findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }

    @Transactional
    public void addCash(Member member, long price, CashLog.EventType eventType) {
        CashLog cashLog = cashService.addCash(member, price, eventType);

        Long newRestCash = member.getRestCash() + cashLog.getPrice();
        member.setRestCash(newRestCash);
    }
}
