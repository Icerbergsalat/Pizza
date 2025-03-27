package com.example.pizza.controller;

import com.example.pizza.useCase.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@ComponentScan
@Controller
public class PizzaController {
    private PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService){
        this.pizzaService = pizzaService;
    }

    @GetMapping("/pizza")
    public String get(Model model) {
        model.addAttribute("pizzas", pizzaService.findAllPizzas());
        return "pizza";
    }

    @GetMapping("/pizza/{id}")
    public String get(@PathVariable int id, Model model){
        model.addAttribute("pizza", id);
        return "pizza";
    }
}
