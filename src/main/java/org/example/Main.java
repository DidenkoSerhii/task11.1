package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Mary");
        names.add("Peter");
        names.add("John");

        String result = getNamesAtEvenIndices(names);
        System.out.println(result);  // Output: 0. Ivan, 2. Peter
    }

    public static String getNamesAtEvenIndices(List<String> names) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (i % 2 != 0) {
                result.append(i).append(". ").append(names.get(i)).append(" ");
            }
        }
        return result.toString();
    }
}