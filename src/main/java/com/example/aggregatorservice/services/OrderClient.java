package com.example.aggregatorservice.services;

import com.example.aggregatorservice.entities.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "orders-service", url = "http://localhost:2023")
public interface OrderClient {

    @GetMapping("/order/{id}")
    public Orders getOrderById(@PathVariable("id") Integer id);

}