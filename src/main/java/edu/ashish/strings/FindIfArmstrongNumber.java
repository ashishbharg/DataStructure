package edu.ashish.strings;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class FindIfArmstrongNumber {

    public static void main(String[] args) {

        int number = 407;
        isArmstrongNumber(number);
//        System.out.println(isArmstrongNumber(number));
    }

    private static void isArmstrongNumber(int number) {

        int n;
        int result = 0;
        int temp = number;
        while(temp > 0) {
            n = temp % 10;
            temp = temp / 10;
            result += (n * n * n);
        }

        if(result == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }
}
