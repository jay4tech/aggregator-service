package com.example.aggregatorservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Orders {
     private Integer id;
    private String name;
    private Double price;
}