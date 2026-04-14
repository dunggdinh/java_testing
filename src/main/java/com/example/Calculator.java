package com.example;

public class Calculator {

    public int sumEvenNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum += 0;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sumEvenNumbers(4)); 
    }
}