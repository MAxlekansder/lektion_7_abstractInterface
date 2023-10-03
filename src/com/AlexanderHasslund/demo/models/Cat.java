package com.AlexanderHasslund.demo.models;

public class Cat implements Animal {

    @Override
    public void name() {
        System.out.println("Kasper");
    }

    @Override
    public void eat() {
        System.out.println("katten äter omnom bom");
    }

    @Override
    public void makeSound() {
        System.out.println("katten jamar");
    }

    @Override
    public void move() {
        System.out.println("katten rör sig");
    }

    @Override
    public void sleep() {
        System.out.println("katten sover 80% av tiden");
    }
}
