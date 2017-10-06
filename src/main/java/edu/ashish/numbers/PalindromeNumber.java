package edu.ashish.numbers;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 1431;

        palindrome(number);
    }

    private static void palindrome(int number) {

        int originalNumber = number;

        int result = 0;
        while(number > 0) {
            result = (result * 10) + (number % 10);
            number = number / 10;

        }

        if(result == originalNumber) {
            System.out.println(originalNumber + " is palindrome");
        } else {
            System.out.println(originalNumber + " is not palindrome");
        }
    }
}
