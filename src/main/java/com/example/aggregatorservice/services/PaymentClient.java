package com.example.aggregatorservice.services;


import com.example.aggregatorservice.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "payment-service", url = "http://localhost:2024")
public interface PaymentClient {

    @GetMapping("/payment/{id}")
    public Payment getPaymentByOrderId(@PathVariable("id") Integer id);

}