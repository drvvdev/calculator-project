package com.drvvdev.calculator;
public class Calculator {
    HistoryManager historyManager = new HistoryManager();
    public double calculate(double a, double b, String operator) {
         if (operator.equals("+")) {
             double result = a + b;
             historyManager.add(a + "+" + b + "=" + result);
            return result;
        } else if (operator.equals("-")) {
             double result = a - b;
             historyManager.add(a + "-" + b + "=" + result);
            return result;
        } else if (operator.equals("*")) {
             double result = a * b;
             historyManager.add(a + "*" + b + "=" + result);
            return result;
        } else if (operator.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException("деление на ноль");
                }
            double result = a / b;
            historyManager.add(a + "/" + b + "=" + result);
                return result;
            } else {
                throw new IllegalArgumentException("неизвестный оператор: " + operator);
            }
        }

    public HistoryManager getHistoryManager() {
        return historyManager;
    }
}








