package com.example.demo.animals;

public class Animal {

    private int legs;

    public Animal(int legs) {
        this.legs = legs;
        System.out.println("here");
    }

    public void howManyLegs() {

        System.out.println(legs);
    }
}
