package edu.ashish.array;

import java.util.Arrays;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class FindPairSumEqualToNumber {

    public static void main(String[] args) {

        int[] array = {5,9,3,1,6,8,11,-4,-1,15};
        int sum=14;
        findAndPrintPairEqualToSum(array, sum);
    }

    private static void findAndPrintPairEqualToSum(int[] array, int sum) {

        Arrays.sort(array);
        int left = 0, right=array.length-1;
        while(left < right) {
            int localSum = array[left] + array[right];
            if(localSum == sum) {
                System.out.printf("%d %d \n", array[left], array[right]);
                if(array[left] == array[left+1]) {
                    left++;
                } else if(array[right] == array[right-1]) {
                    right--;
                } else {
                    left++;
                    right--;
                }
            }
            if(localSum < sum) {
                left++;
            }
            if(localSum > sum) {
                right--;
            }
        }
    }
}
