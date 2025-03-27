package com.example.pizza.database;

import com.example.pizza.model.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public Order save(Order order) {
        String sql = "INSERT INTO order (date, pizzas, total) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, order.getDate(), order.getPizzas(), order.getTotal());
        return order;
    }

    public Order findByid(int id) {
        String sql = "SELECT * FROM order WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Order.class), id);
    }

    public List<Order> findAll() {
        String sql = "SELECT * FROM order";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Order.class));
    }

    public void update(Order order) {
        String sql = "UPDATE order SET date = ?, pizzas = ?, total = ?, WHERE id = ?";
        jdbcTemplate.update(sql, order.getDate(), order.getPizzas(), order.getTotal());
    }
    public void delete(int id) {
        String sql = "DELETE FROM order WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}