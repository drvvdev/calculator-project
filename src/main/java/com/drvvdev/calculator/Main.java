package com.drvvdev.calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("Введи выражение");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("работа завершена");
                break; }
                try {
                 String[] parts = input.split(" ");
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
                }
            }
        }
    }














