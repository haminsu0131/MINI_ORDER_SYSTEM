package com.jasp.mini_order_system.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Member extends Common {

    // 회원 이메일
    private String email;
    // 회원 비밀번호
    private String password;
    // 회원 닉네임
    private String nickname;
    // 회원 계좌
    private Account account;

}