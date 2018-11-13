package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component // poate fi si adnotatia Service
public class MyModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyModel{" + "name='" + name + '\'' + '}';
    }
}
