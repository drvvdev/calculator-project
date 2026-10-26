package com.drvvdev.calculator.operations;

public class MultiplicateOperation implements Operation {
    @Override
    public double execute(double a, double b) {
        return (a * b);
    }
}
