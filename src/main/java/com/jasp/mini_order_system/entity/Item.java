package com.jasp.mini_order_system.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Item extends Common {
    // 상품 이름
    private String item_name;
    // 상품 가격
    private int item_price;
    // 상품 카테고리
    private Category category;

}