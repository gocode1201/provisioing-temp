package com.example.demo.inter;

public interface AbstractFactory <T> {
    T create(String operation);
}
