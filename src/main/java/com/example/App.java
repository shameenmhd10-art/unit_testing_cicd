package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello, Maven Testing!");
        System.out.println("Sum: " + add(2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
