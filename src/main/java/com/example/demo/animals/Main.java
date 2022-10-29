package com.example.demo.animals;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {

            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");

            }

            for (int m = 0; m <= i; m++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
