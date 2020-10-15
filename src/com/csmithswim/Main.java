package com.csmithswim;
import java.util.Scanner;
/*
The algorithm to convert from Celsius to Fahrenheit is the temperature in Celsius times 9/5, plus 32.
You are given a variable celsius representing a temperature in Celsius. Use the variable fahrenheit already defined and assign
it the Fahrenheit temperature equivalent to the given Celsius temperature.
Use the algorithm mentioned above to help convert the Celsius temperature to Fahrenheit.*/

public class Main {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program converts Celsius to Fahrenheit. Please enter Celsius for conversion.\nCelsius: ");

        float input = scanner.nextFloat();
        System.out.println(input);

    }
}

