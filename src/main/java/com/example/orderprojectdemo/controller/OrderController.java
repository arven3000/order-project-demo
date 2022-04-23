package com.example.orderprojectdemo.controller;

import com.example.orderprojectdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> id) {
        return orderService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return orderService.get();
    }
}
