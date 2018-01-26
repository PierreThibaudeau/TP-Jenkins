package com.imie.tp.calculator.utils;

import java.util.ArrayList;

public class HistoryManager {

    // Singleton
    private static final HistoryManager instance = new HistoryManager();
    public static HistoryManager getInstance() {
        return instance;
    }

    private ArrayList<String> cache = new ArrayList<String>();

    public void addOperation(String operation) {
        this.cache.add(operation);
    }

    public void clear() {
        this.cache.clear();
    }

    public String getHistory() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : cache) {
            stringBuilder.append(string + "\n");
        }

        return stringBuilder.toString();
    }
}