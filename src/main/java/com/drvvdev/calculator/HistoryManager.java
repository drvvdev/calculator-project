package com.drvvdev.calculator;

import java.util.ArrayList;

public class HistoryManager {
    ArrayList<String> history = new ArrayList<>();
    public void add(String operation) {
        history.add(operation);
        if (history.size() > 10) {
            history.remove(0);
        }

    }
    public int size() {
        return history.size();
    }
    public String get(int index) {
        return history.get(index);
    }
    public void clear() {
        history.clear();
    }
    public String getLast() {
        if (history.size()==0) {
            return null;
        }
       return history.get(history.size() -1);

    }
}

