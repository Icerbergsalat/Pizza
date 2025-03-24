package com.example.pizza.useCase;

import com.example.pizza.database.OrderRepository;

public class OrdreService {
    private final OrderRepository orderRepository;

    public OrdreService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
