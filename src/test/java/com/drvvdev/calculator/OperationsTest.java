package com.drvvdev.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.drvvdev.calculator.calculator.Calculator;
import com.drvvdev.calculator.operations.*;
import org.junit.jupiter.api.Test;

public class OperationsTest {
    @Test
    public void addOperationWorks() {
        Operation op = new AddOperation();
        assertEquals(8, op.execute(5, 3) );
    }
    @Test
    public void substractionWorks() {
        Operation op = new SubstractOperation();
        assertEquals(60, op.execute(67, 7));
        }
        @Test
        public void multiplicationWorks() {
        Operation op = new MultiplicateOperation();
        assertEquals(20, op.execute(5, 4));
        }
        @Test
    public void divisionWorks() {
        Operation op = new DivisionOperation();
        assertEquals(5, op.execute(20, 4));
        }
        @Test
    public void divisionByZeroThrowE() {
        Operation op = new DivisionOperation();
        assertThrows(ArithmeticException.class,()-> op.execute(10, 0));
        }
        @Test
    public void unknownOperatorThrowE() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,()-> calculator.calculate(5, 3, "%"));
        }

    }

