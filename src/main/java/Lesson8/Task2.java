package Lesson8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a list of numbers separated by commas:");
        String input = scanner.nextLine();

        String[] numbersArray = input.split(",");
        Set<String> uniqueNumbers = new HashSet<>();
        for (String number : numbersArray) {
            uniqueNumbers.add(number);
        }

        System.out.println("New set of numbers that does not contain duplicates : " + uniqueNumbers);
    }
}
