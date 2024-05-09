package Lesson8;

import java.util.HashMap;
import java.util.Map;

public class ToyStore {
    private Map<String, String> toyMap = new HashMap<>();

    public void addToy(String name, String toy) {
        toyMap.put(name, toy);
    }

    public void printPairs() {
        System.out.println("Pairs of values - entrySet:");
        for (Map.Entry<String, String> entry : toyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }

    public void printProductNames() {
        System.out.println("Set of product names - keySet:");
        for (String name : toyMap.keySet()) {
            System.out.println(name);
        }
        System.out.println();
    }

    public void printProductValues() {
        System.out.println("Product object - values:");
        for (String toy : toyMap.values()) {
            System.out.println(toy);
        }
        System.out.println();
    }

}
