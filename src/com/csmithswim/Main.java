package com.csmithswim;
import java.util.Scanner;

public class Main {
/* Reverse the provided string. You may need to turn the string into an array before you can reverse it.
Your result must be a string.
ReverseString("hello") should return a string.
reverseString("hello") should become "olleh".
reverseString("Howdy") should become "ydwoH".
reverseString("Greetings from Earth") should return "htraE morf sgniteerG".
 */
//    Method to reverse string using a for loop and substring method

    public static String reverseString(String word){

        String reversedString = "";

        for (int i = word.length()-1; i >= 0; i--){

            reversedString += word.substring(i,i+1);
        }
        System.out.println(reversedString);
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program reverses a word, please enter word to be reversed.\nWord: ");
        String input = scanner.nextLine();
        reverseString(input);
    }
}

