package edu.ashish.sorts;

/**
 * Created by abha51 on 10/4/2017.
 */
public class MergeSort {

    private static final int CUTOFF = 2;

    public static void main(String[] args) {
        int[] arr = new int[] {5,7,12,2,3,9,10,4};
        mergeSort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void mergeSort(int[] arr) {
        int[] aux = new int[arr.length];
        sort(arr,aux,0,arr.length - 1);
    }

    private static void sort(int[] arr, int[] aux, int lo, int hi) {

        //Optimization, Use Insertion sort as merge sort has too much overhead for tiny sub-arrays.
//        if(hi <= lo) {
        if(hi <= lo + CUTOFF -1) {
            return;
        }

        int mid = lo + (hi - lo) / 2;
        sort(arr, aux, lo , mid);
        sort(arr, aux, mid + 1, hi);
        //Optimization - If value of mid+1 is greater than mid, that means no need to merge the array as it is already sorted.
        if(arr[mid]<arr[mid+1]) {
            return;
        }
        merge(arr, aux, lo, mid, hi);
    }

    public static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        for(int k=0; k <= hi; k++) {
            aux[k] = arr[k];
        }

        int i = lo;
        int j = mid + 1;
        for(int k=lo; k<=hi; k++) {
            if(i > mid) {
                arr[k] = aux[j++];
            } else if(j > hi) {
                arr[k] = aux[i++];
            } else if(aux[i] <= aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }
}
