package com.event.driven.basedomains.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String name;
    private int quantity;
    private double price;


}
