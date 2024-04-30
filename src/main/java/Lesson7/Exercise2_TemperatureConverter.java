package Lesson7;

import java.util.Scanner;

public class Exercise2_TemperatureConverter {
    public static void main(String[] args) {
        // Create a program that converts temperature from Celsius to Fahrenheit. Prompt the user to enter a temperature in Celsius, perform the conversion, and display the result.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in Celsius degree: ");
        double celsiusTemperature = scanner.nextDouble();
        double fahrenheit = (celsiusTemperature * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

