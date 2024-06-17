package com.event.driven.basedomains.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderEvent {
    private String message;
    private String status;
    private Order order;
}
