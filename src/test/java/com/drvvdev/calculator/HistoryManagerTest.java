package com.drvvdev.calculator;

import com.drvvdev.calculator.history.HistoryManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoryManagerTest {
    @Test
    void HistoryAdd() {
        HistoryManager historyManager = new HistoryManager();
        historyManager.add("5 + 3 = 8");
        assertEquals(1, historyManager.size());
    }

    @Test
    void historyKeepsOnlyLastTen() {
        HistoryManager historyManager = new HistoryManager();
        for (int i = 0; i < 11; i++) {
            historyManager.add("2 + 2 = 4");

        }
        assertEquals(10, historyManager.size());
    }

    @Test
    void historyGetReturnsCorrectOperation() {
        HistoryManager historyManager = new HistoryManager();
        historyManager.add("5 + 3 = 8");
        historyManager.add("10 - 4 = 6");
        assertEquals("10 - 4 = 6", historyManager.get(1));
        assertEquals("5 + 3 = 8", historyManager.get(0));
    }

    @Test
    void historyRemovesOldestOperation() {
        HistoryManager historyManager = new HistoryManager();
        for (int i = 0; i < 11; i++) {
            historyManager.add("операция" + i);
        }
        assertEquals("операция1", historyManager.get(0));
    }
    @Test
    void historyClear() {
        HistoryManager historyManager = new HistoryManager();
        for (int i = 0; i < 11; i++) {
            historyManager.add("операция1" + i);
        }
        historyManager.clear();
        assertEquals(0, historyManager.size());
    }
    @Test
    public void getLast() {
        HistoryManager historyManager = new HistoryManager();
        historyManager.add("4 + 5 = 9");
        historyManager.add("67 - 7 = 60");
        assertEquals("67 - 7 = 60", historyManager.getLast());
    }
    @Test
    public void getLastNull() {
        HistoryManager historyManager = new HistoryManager();
        assertEquals(null, historyManager.getLast());

    }
}

