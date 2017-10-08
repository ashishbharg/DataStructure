package edu.ashish.sorts;

/**
 * Created by abha51 on 10/4/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,7,12,2,3,9,10,4};
        selectionSort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void selectionSort(int[] n) {
        int temp;
        for(int i=0; i<n.length; i++) {
            int min = i;
            for(int j=i+1; j<n.length; j++) {
                if(n[j] < n[min]) {
                    min = j;
                }
            }
            if(n[i] > n[min]) {
                temp = n[i];
                n[i] = n[min];
                n[min] = temp;
            }
        }
    }
}
