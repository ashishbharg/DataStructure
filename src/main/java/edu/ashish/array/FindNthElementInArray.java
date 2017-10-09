package edu.ashish.array;

import java.util.Random;

/**
 * Created by ashish.bhargava on 10/9/2017.
 */
public class FindNthElementInArray {

    public static void main(String[] args) {

        int n=3;
        int[] array = new int[] {13, 2, 1, 5, 10};
        System.out.println(findElementInArray(array, n));
    }

    private static int findElementInArray(int[] array, int n) {

        if(n > array.length) {
            System.out.println("Number entered is not in correct range");

        }
        shuffle(array);
        int lo = 0, hi = array.length - 1;
        while(hi > lo) {
            int j = partition(array, lo, hi);
            if(j < n) lo = j + 1;
            else if(j > n) hi = j - 1;
            else return array[n];
        }
        return array[n];
    }

    private static int partition(int[] array, int lo, int hi) {

        int i = lo, j = hi + 1;
        while(true) {
            while(array[++i] < array[lo]) {
                if(i == hi) {
                    break;
                }
            }
            while(array[lo] < array[--j] ) {
                if(j == lo) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        int temp = array[lo];
        array[lo] = array[j];
        array[j] = temp;
        return j;
    }

    private static void shuffle(int[] array) {
        Random random = new Random(array.length);
        int r;
        for(int i=0; i<array.length; i++) {
            r = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[r];
            array[r] = temp;
        }
    }
}
