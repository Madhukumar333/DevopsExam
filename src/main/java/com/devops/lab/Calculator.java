package com.devops.lab;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 5 = " + calc.add(10, 5));
    }
}
