package com.example.aggregatorservice.controllers;


import com.example.aggregatorservice.entities.AggregateData;
import com.example.aggregatorservice.entities.Orders;
import com.example.aggregatorservice.entities.Payment;
import com.example.aggregatorservice.services.OrderClient;
import com.example.aggregatorservice.services.PaymentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aggregate")
public class AggregatorController {
    @Autowired
    private OrderClient orderClient;
    @Autowired
    private PaymentClient paymentClient;

    @GetMapping("/{id}")
    public AggregateData aggregate(@PathVariable Integer id) {
        Orders order = orderClient.getOrderById(id);
        Payment payment = paymentClient.getPaymentByOrderId(id);
        return new AggregateData(order, payment);
    }

}