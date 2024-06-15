/*
Title: Sieve of Eratosthenes
Name: Karanvir Kooner
Date: 2024-06-14
Purpose: To create a program that will output
the primes numbers according to the upper bound
*/

// importing scanner library
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // setting up scanner
        Scanner input = new Scanner(System.in);
        // initializing upper bound
        int upperBound = 0;

        System.out.print("Enter an upper bound (2-1000): ");

        if (input.hasNext()){
            upperBound = input.nextInt();

            if (upperBound >=2 && upperBound <= 1000) {
                
            } else {
                System.out.println("Error! Number must be 2-1000!");
            }
        } else {
            System.out.println("Error! Must be integer!");
        }
    }
}