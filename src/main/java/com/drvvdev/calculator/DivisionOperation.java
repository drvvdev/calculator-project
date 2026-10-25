package com.drvvdev.calculator;

public class DivisionOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b==0) {
            throw new ArithmeticException("деление на ноль");
        }
            return (a / b);

    }

}
