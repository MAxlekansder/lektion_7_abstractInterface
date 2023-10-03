package com.AlexanderHasslund.demo.models;

public class Dog implements Animal {

    @Override
    public void name() {
        System.out.println("Fido");
    }

    @Override
    public void eat() {
        System.out.println("hunden äter tills den kräks");
    }

    @Override
    public void makeSound() {
        System.out.println("hunden skäller");
    }

    @Override
    public void move() {
        System.out.println("hunden rör sig");
    }

    @Override
    public void sleep() {
        System.out.println("hunden sover 50% av tiden");
    }
}
