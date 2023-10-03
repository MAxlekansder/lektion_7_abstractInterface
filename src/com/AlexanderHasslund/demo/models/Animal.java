package com.AlexanderHasslund.demo.models;


//uses keyword: implements
//by defualt methods are PUBLIC, as a standard
// Abstract - Inheritance
public interface Animal {

    //TODO - give relevant names
    //TODO - implement inheritance
    //TODO - superviktigt private vis/mod

    //abstract method
    //void myAbstractMethod();
    void name();
    void eat();
    void makeSound();
    void move();
    void sleep();

    default void typeOfAnimal(String typeOfAnimal) {
        System.out.println(typeOfAnimal);
    }



}
