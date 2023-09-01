package com.example.aggregatorservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
    private Integer orderId;
    private String status;
}
