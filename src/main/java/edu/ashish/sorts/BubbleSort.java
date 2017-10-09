package edu.ashish.sorts;

/**
 * Created by ashish.bhargava on 10/8/2017.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,7,12,2,3,9,10,4};
        bubbleSort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            for(int j=0; j<length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
