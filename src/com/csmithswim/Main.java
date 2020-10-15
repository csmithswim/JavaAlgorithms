package com.csmithswim;
import java.util.Scanner;
/*
The algorithm to convert from Celsius to Fahrenheit is the temperature in Celsius times 9/5, plus 32.
You are given a variable celsius representing a temperature in Celsius. Use the variable fahrenheit already defined and assign
it the Fahrenheit temperature equivalent to the given Celsius temperature.
Use the algorithm mentioned above to help convert the Celsius temperature to Fahrenheit.*/

public class Main {
/* Reverse the provided string. You may need to turn the string into an array before you can reverse it.
Your result must be a string.
ReverseString("hello") should return a string.
reverseString("hello") should become "olleh".
reverseString("Howdy") should become "ydwoH".
reverseString("Greetings from Earth") should return "htraE morf sgniteerG".
 */
    //Method to reverse string
    public static String reverseAString(String word){

        return word;

    }

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program reverses a word, please enter word to be reversed.\nWord: ");

        String input = scanner.next();
        System.out.println(input);
    }


}

