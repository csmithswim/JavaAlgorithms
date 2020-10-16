package com.csmithswim;
import java.util.Scanner;

public class Main {/*
Return the factorial of the provided integer.If the integer is represented with the letter n,
a factorial is the product of all positive integers less than or equal to n.
Factorials are often represented with the shorthand notation n!
For example: 5! = 1 * 2 * 3 * 4 * 5 = 120
factorialize(5) should return a number.
factorialize(5) should return 120.
factorialize(10) should return 3628800.
factorialize(20) should return 2432902008176640000.
factorialize(0) should return 1.
Only integers greater than or equal to zero will be supplied to the function.
 */
    public static double factorialize(double number){

        double count = 1;
        double factorial = 1;

        while (count < number+1){

            factorial *= count;
            count++;

        }
        System.out.println(factorial);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number for its factorial to be computed: ");
        double input = scanner.nextDouble();
        factorialize(input);
    }
}

