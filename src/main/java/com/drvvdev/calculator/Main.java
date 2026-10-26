package com.drvvdev.calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("Введи выражение");
            String input = scanner.nextLine().trim();
            if (input.equals("exit")) {
                System.out.println("работа завершена");
                break; }
            if (input.equals("history")) {
                HistoryManager historyManager = calculator.getHistoryManager();
                if (historyManager.size() ==0) {
                    System.out.println("история пуста");
                }
                for (int i = 0; i < historyManager.size(); i++) {
                    System.out.println(historyManager.get(i));
                }
                continue;
            }
            if (input.equals("last")) {
                HistoryManager historyManager = calculator.getHistoryManager();
                String lastOperation = historyManager.getLast();
                if (lastOperation == null) {
                    System.out.println("программа пуста");
                    continue;
                }
                System.out.println(calculator.repeatLast());
                continue;
            }
                if (input.equals("clear")) {
                    HistoryManager historyManager1 = calculator.getHistoryManager();
                    historyManager1.clear();
                    System.out.println("история очищена");
                    continue;
                    }
                    if (input.equals("help")) {
                        printHelp();
                        continue;
                    }
                    processCalculation(input, calculator);
            }
        }
        private static void printHelp() {
            System.out.println("Доступные команды:\n" +
                    "\n" +
                    "<число> <оператор> <число>\n" +
                    "\n" +
                    "Операторы:\n" +
                    "+ — сложение\n" +
                    "- — вычитание\n" +
                    "* — умножение\n" +
                    "/ — деление\n" +
                    "\n" +
                    "Дополнительные команды:\n" +
                    "history — показать историю\n" +
                    "last — повторить последнюю операцию\n" +
                    "clear — очистить историю\n" +
                    "help — показать эту справку\n" +
                    "exit — выход");
        }
        private static void processCalculation(String input, Calculator calculator) {
            try {
                String[] parts = input.split("\\s+");
                double a = Double.parseDouble(parts[0]);
                String operator = parts[1];
                double b = Double.parseDouble(parts[2]);
                double result = calculator.calculate(a, b, operator);
                System.out.println(a + " " + operator + " " + b + " = " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ошибка: неверный формат пиши очисло оператор число ");
            } catch (ArithmeticException e) {
                System.out.println("ошибка: деление на ноль ");
            } catch (NumberFormatException e) {
                System.out.println("ошибка: неверный формат пиши очисло оператор число");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: неизвестный оператор");
            }
        }
    }














