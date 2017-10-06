package edu.ashish.numbers;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class NthNumberInFibonacciSeriesRecursiveApproach {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacci(n));

    }

    private static int fibonacci(int n) {

        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
