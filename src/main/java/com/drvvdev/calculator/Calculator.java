package com.drvvdev.calculator;
import java.util.HashMap;
import java.util.Map;
public class Calculator {
    Map<String, Operation> operations = new HashMap<>();
    HistoryManager historyManager = new HistoryManager();
    private double lastA;
    private double lastB;
    private String lastOperator;
    public Calculator() {
        // для регистрации ключей то есть сложение вычитание и тд
        operations.put("+", new AddOperation());
        operations.put("-", new SubstractOperation());
        operations.put("*", new MultiplicateOperation());
        operations.put("/", new DivisionOperation());
    }
    public double repeatLast() {
        if (lastOperator == null) {
            throw new IllegalStateException("нет предыдущей операции");
        }
        return calculate(lastA, lastB, lastOperator);
    }
    public double calculate(double a, double b, String operator) {
        Operation op = operations.get(operator);
        if (op == null) {
            throw new IllegalArgumentException("неизвестный оператор");
        }
            double result = op.execute(a, b);
         lastA = a;
         lastB = b;
        lastOperator = operator;
        historyManager.add(a+operator+b+"="+result);
        return result;
        }
    public HistoryManager getHistoryManager() {
        return historyManager;
    }
}








