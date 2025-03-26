package com.example.pizza.useCase;

import com.example.pizza.database.OrderRepository;
import com.example.pizza.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(){

    }

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderById(int id) {
        return orderRepository.findByid(id);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public void updateOrder(Order order) {
        orderRepository.save(order);
    }

    public void deleteOrder(int id) {
        orderRepository.delete(id);
    }
}
