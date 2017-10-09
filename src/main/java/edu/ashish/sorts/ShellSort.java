package edu.ashish.sorts;

/**
 * Created by abha51 on 10/4/2017.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[] {5,19,7,12,2,3,24,34,9,10,4,1,21,16,11};
        shellSort(arr);
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void shellSort(int[] arr) {
        int length = arr.length;

        int h = 1;
        while(h < length/3) {
            h = 3 * h + 1;
        }

        while(h >= 1) {
            for(int i=h; i<length; i++) {
                for(int j=i; j>=h; j-=h) {
                    if(arr[j] < arr[j-h]) {
                        int temp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j-h] = temp;
                    }
                }
            }
            h /= 3;
        }
    }
}
