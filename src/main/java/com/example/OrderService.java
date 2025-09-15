package com.example;

import java.util.ArrayList;
import java.util.List;

/*
 * Smelly implementation: O(n^2) approach that computes total by counting occurrences
 * (inefficient for large lists). Purpose: ask Copilot to refactor to O(n).
 */
public class OrderService {
    public static void main(String[] args) {
        System.out.println("OrderService application started.");
        // You can add more logic here as needed
    }

    public static int calculateTotal(List<Integer> items) {
        List<Integer> unique = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            int val = items.get(i);
            if (!unique.contains(val)) {
                int count = 0;
                for (int j = 0; j < items.size(); j++) {
                    if (items.get(j) == val)
                        count++;
                }
                total += val * count;
                unique.add(val);
            }
        }
        return total;
    }
}
