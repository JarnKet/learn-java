package org.example.lesson06;

public class MethodsDemo {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("add(5, 3) = " + result);

        greet("ມະລີ");

        System.out.println("getRandomNumber() = " + getRandomNumber());

        System.out.println("add(5, 3) = " + add(5, 3));
        System.out.println("add(5.5, 3.2) = " + add(5.5, 3.2));
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static void greet(String name) {
        System.out.println("ສະບາຍດີ " + name);
    }

    static int getRandomNumber() {
        return 42;
    }
}
