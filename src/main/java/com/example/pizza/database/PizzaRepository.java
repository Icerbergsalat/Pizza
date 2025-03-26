package com.example.pizza.database;

import com.example.pizza.model.Pizza;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PizzaRepository {
    private JdbcTemplate jdbcTemplate;

    public PizzaRepository(){
    }

    public PizzaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Pizza save(Pizza pizza) {
        String sql = "INSERT INTO pizza (name, description, price, topping) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, pizza.getName(), pizza.getDescription(), pizza.getPrice(), pizza.getTopping());
        return pizza;
    }

    public Pizza findByTopping(String topping) {
        String sql = "SELECT * FROM users WHERE email = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Pizza.class), topping);
    }

    public List<Pizza> findAll() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pizza.class));
    }

    public void update(Pizza pizza) {
        String sql = "UPDATE users SET name = ?, description = ?, price = ?, topping = ? WHERE id = ?";
        jdbcTemplate.update(sql, pizza.getName(), pizza.getDescription(), pizza.getPrice(), pizza.getTopping());
    }
    public void delete(int id) {
        String sql = "DELETE FROM pizza WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
