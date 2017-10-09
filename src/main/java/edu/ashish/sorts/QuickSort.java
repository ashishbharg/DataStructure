package edu.ashish.sorts;

import java.util.Random;

/**
 * Created by ashish.bhargava on 10/9/2017.
 */
public class QuickSort {

    private static final int CUTOFF = 2;

    public static void main(String[] args) {
        int[] arr = new int[] {5,7,12,2,3,9,10,4};
        quickSort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void quickSort(int[] arr) {
        shuffle(arr);
        quickSort(arr, 0, arr.length - 1);
    }

    private static void shuffle(int[] arr) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            int random = new Random(System.currentTimeMillis()).nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        //Optimization, Use Insertion sort as merge sort has too much overhead for tiny sub-arrays.
//        if(hi <= lo) {
        if(hi <= lo + CUTOFF -1) {
            return;
        }
        int j = partition(arr, lo, hi);
        quickSort(arr, lo, j - 1);
        quickSort(arr, j + 1, hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo, j = hi + 1;
        while(true) {
            while(arr[++i] < arr[lo]) {
                if(i == hi) {
                    break;
                }
            }
            while(arr[lo] < arr[--j]) {
                if(j == lo) {
                    break;
                }
            }
            if(i >=j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[lo];
        arr[lo] = arr[j];
        arr[j] = temp;
        return j;
    }
}
