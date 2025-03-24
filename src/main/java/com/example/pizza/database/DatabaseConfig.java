package com.example.pizza.database;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://iouhase.net:3306/pizza_db");
        ds.setUsername("user");
        ds.setPassword("26Uj96MSlPMV4o3aHqIypWcu");
        return ds;
    }
}