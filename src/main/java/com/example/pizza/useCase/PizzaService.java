package com.example.pizza.useCase;

import com.example.pizza.database.PizzaRepository;
import com.example.pizza.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza createPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Pizza findPizzaByTopping(String topping) {
        return pizzaRepository.findByTopping(topping);
    }

    public List<Pizza> findAllPizzas() {
        return pizzaRepository.findAll();
    }

    public void updatePizza(Pizza pizza) {
        pizzaRepository.update(pizza);
    }

    public void deletePizza(int id) {
        pizzaRepository.delete(id);
    }
}
