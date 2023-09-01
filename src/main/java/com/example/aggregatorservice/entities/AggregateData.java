package com.example.aggregatorservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AggregateData {
    private Orders order;
    private Payment payment;
}