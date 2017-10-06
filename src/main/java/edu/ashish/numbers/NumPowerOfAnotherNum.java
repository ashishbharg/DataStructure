package edu.ashish.numbers;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class NumPowerOfAnotherNum {

    public static void main(String[] args) {
        int x = 2, y = 30;
        boolean result = isNumberPowerOfAnotherNumber(x, y);
        System.out.println(result);
    }

    private static boolean isNumberPowerOfAnotherNumber(int x, int y) {

        if(x == 1 && y != 1) {
            return false;
        }
        int pow = 1;
        while(pow < y) {
            pow *= x;
        }
        return pow == y;
    }
}
