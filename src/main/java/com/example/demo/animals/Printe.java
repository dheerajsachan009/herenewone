package com.example.demo.animals;

import java.util.List;

public class Printe <T>{

    T print;


    public Printe() {
    }

    public Printe(T print) {
        this.print = print;
    }

    public void setPrint() {
        System.out.println(print);
    }

    public void printHere(List<String> what){
        System.out.println("came21w here");
        System.out.println(what);
    }

    @Override
    public String toString() {
        return "Printe{" +
                "print=" + print +
                '}';
    }


}
