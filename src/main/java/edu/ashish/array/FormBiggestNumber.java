package edu.ashish.array;

import java.util.*;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class FormBiggestNumber {

    public static void main(String[] args) {
        int[] numbers = {1,34,3,98,9,76,45,4};
        // Output should be 998764543431.
        formBiggestNumber(numbers);
    }

    private static void formBiggestNumber(int[] numbers) {

        List<String> list = new ArrayList<>();
        for(int n: numbers) {
            list.add(String.valueOf(n));
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                String num1 = a + b;
                String num2 = b + a;
                return -num1.compareTo(num2);
            }
        });

        for(String str: list) {
            System.out.print(str);
        }
    }
}
