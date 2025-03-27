package com.example.pizza.database;

import com.example.pizza.model.Pizza;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PizzaRepository {
    private final JdbcTemplate jdbcTemplate;

    public PizzaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Pizza save(Pizza pizza) {
        String sql = "INSERT INTO pizza (id, name, description, price, topping) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, pizza.getId(), pizza.getName(), pizza.getDescription(), pizza.getPrice(), pizza.getTopping(), pizza.getImage());
        return pizza;
    }

    public Pizza findByTopping(int topping) {
        String sql = "SELECT * FROM pizza WHERE fkTopping = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Pizza.class), topping);
    }

    public Pizza findById(int id) {
        String sql = "SELECT * FROM pizza WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Pizza.class), id);
    }

    public List<Pizza> findAll() {
        String sql = "SELECT * FROM pizza";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pizza.class));
    }

    public void update(Pizza pizza) {
        String sql = "UPDATE pizza SET name = ?, description = ?, price = ?, topping = ?, image = ? WHERE id = ?";
        jdbcTemplate.update(sql, pizza.getName(), pizza.getDescription(), pizza.getPrice(), pizza.getTopping(), pizza.getImage(), pizza.getId());
    }
    public void delete(int id) {
        String sql = "DELETE FROM pizza WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}