package edu.ashish.numbers;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class NthNumberInFibonacciSeriesIterativeApproach {

    public static void main(String[] args) {

        System.out.println(fibonacci(9));



    }

    private static int fibonacci(int n) {
        int sum = 0;
        int a = 0;
        int b = 1;
        for(int i = 0; i<n ; i++) {
//            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;

        }
        return sum;
    }
}
