package com.xixi.domain;

public class Car1 {
    private String name;
    private String color;

    public Car1(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
