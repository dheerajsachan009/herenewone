package com.example.demo.animals;

public class C {

    public static void main(String[] args) {
        int x = C.display();
        System.out.println(x);
    }

    public static int display() {
        System.out.println("hello");
        int c = B.changeValue();
        return c;
    }
}
