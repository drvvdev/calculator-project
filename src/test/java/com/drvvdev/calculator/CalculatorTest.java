package com.drvvdev.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void additionReturnsCorrectResult() {
// тест: сложение возвращает правильный результат
        Calculator calculator = new Calculator();
// создать объект Calculator
        assertEquals(8, calculator.calculate(5, 3, "+"), 0.001);
// проверить: 5 + 3 = 8.0
    }

    @Test
    void substractionReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(60, calculator.calculate(67, 7, "-"), 0.001);
    }

    @Test
    void applicationReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(42, calculator.calculate(6, 7, "*"), 0.001);
    }

    @Test
    void divisionReturnsCorrectResult() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.calculate(42, 7, "/"), 0.001);
    }

    @Test
void divisionByZeroThrowException() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.calculate(5, 0, "/"));
    }
}




