package com.example.orderprojectdemo.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Order {
    private final List<Integer> ids = new ArrayList<>();

    public List<Integer> getId() {
        return ids;
    }

    public void setId(List<Integer> ids) {
        this.ids.addAll(ids);
    }
}
