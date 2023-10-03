package com.AlexanderHasslund.demo.models;

//abstract class - marked by keyword: abstrac
public abstract class AAnimal {

    //Includes abstract, excludes body:
    public abstract void eat();


    //ordinary method - det finns en body, underkodsblock
    public void makeSound() {
        System.out.println("squueeeeeek");
    }
}
