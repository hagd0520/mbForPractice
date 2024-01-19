package com.ll.mbforpractice.domain.member.member.entity;

import com.ll.mbforpractice.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
@ToString(callSuper = true)
public class Member extends BaseEntity {
    private String username;
    private String password;
}
