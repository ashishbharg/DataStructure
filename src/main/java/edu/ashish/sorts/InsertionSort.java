package edu.ashish.sorts;

/**
 * Created by abha51 on 10/4/2017.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,7,12,2,3,9,10,4};
        insertionSort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
