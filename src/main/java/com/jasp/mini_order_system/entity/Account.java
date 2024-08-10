package com.jasp.mini_order_system.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Account extends Common {

    // 계좌 번호
    private String accountNumber;
    // 계좌 잔액
    private int balance;

    // 출금 메서드
    public void withdraw(int amount)
    {
        balance -= amount;
        System.out.println("잔액 : " + balance);
    }
    // 입금 메서드
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("잔액 : " + balance);
    }
}