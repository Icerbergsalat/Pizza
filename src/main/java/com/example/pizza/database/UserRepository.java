package com.example.pizza.database;

import com.example.pizza.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserRepository {
    private JdbcTemplate jdbcTemplate;

    public UserRepository() {
    }

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public User save(User user) {
        String sql = "INSERT INTO users (name, email, address, bonusPoints) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAddress(), user.getBonusPoints());
        return user;
    }

    public User findByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), email);
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    public void update(User user) {
        String sql = "UPDATE users SET name = ?, email = ?, address = ?, bonusPoints = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAddress(), user.getBonusPoints());
    }
    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}