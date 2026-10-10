import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
       System.out.println("---Тесты---");
       System.out.println("5 + 3 = " + calculator.calculate(5, 3, "+"));
       System.out.println("67 - 8 = " + calculator.calculate(67, 8,"-"));
       System.out.println("42 / 7 = " + calculator.calculate(42, 7, "/"));
       System.out.println("6 * 7 = " + calculator.calculate(6, 7, "*"));
       System.out.println("---Конец тестов---");
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














