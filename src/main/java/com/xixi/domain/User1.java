package com.xixi.domain;

public class User1 {
    private String name;
    private Integer age;
    private Car1 car;

    public User1(String name, Integer age, Car1 car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
