package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component // poate fi si adnotatia Service
public class MyModel {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}