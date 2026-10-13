package com.drvvdev.calculator;
public class Calculator {
    // обьява класса калькулятор
    public double calculate(double a, double b, String operator) {
         if (operator.equals("+")) {
            return (a + b);
        } else if (operator.equals("-")) {
            return (a - b);
        } else if (operator.equals("*")) {
            return (a * b);
        } else if (operator.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("деление на ноль");
                }
                return (a / b);
            } else {
                throw new IllegalArgumentException("неизвестный оператор: " + operator);
            }
        }
    }








