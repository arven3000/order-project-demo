package com.example.orderprojectdemo.service;

import com.example.orderprojectdemo.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    Order order;

    @Autowired
    public OrderServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public List<Integer> get() {
        return order.getId();
    }

    @Override
    public void add(List<Integer> id) {
        order.setId(id);
    }
}
