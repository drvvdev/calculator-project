package com.drvvdev.calculator.operations;

public class AddOperation implements Operation {
    // Класс реализует интерфейс Operation и обязан выполнять его методы (связка с интерфейс)
    @Override
    public double execute(double a, double b) {
        return (a + b);

    }
}


