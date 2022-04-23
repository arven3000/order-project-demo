package com.example.orderprojectdemo.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Order {
    private final List<Integer> ids;

    public Order() {
        this.ids = new ArrayList<>();
    }

    public List<Integer> getId() {
        return Collections.unmodifiableList(ids);
    }

    public List<Integer> addId(List<Integer> ids) {
        this.ids.addAll(ids);
        return ids;
    }
}
