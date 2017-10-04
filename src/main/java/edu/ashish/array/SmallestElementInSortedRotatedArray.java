package edu.ashish.array;

/**
 * Created by ashish.bhargava on 10/4/2017.
 */
public class SmallestElementInSortedRotatedArray {

    public static void main(String... args) {

        int[] array = new int[]{10, 14, 5, 7, 9};

        int smallestElement = findSecondSmallestMin(array,0, array.length);
        System.out.println("Smallest element in array is : " + smallestElement);
    }

    private static int findSecondSmallestMin(int[] array, int low, int hi) {

        //This condition is needed when array is not at all rotated.
        if(low > hi) {
            return array[0];
        }

        if(low == hi) {
            return array[low];
        }

        int mid = low + (hi - low) / 2;

        if(mid < hi && array[mid + 1] < array[mid]) {
            return array[mid];
        }

        if(mid > low && array[mid] < array[mid - 1]) {
            return array[mid];
        }

        if(array[hi] > array[mid]) {
            return findSecondSmallestMin(array, low, mid -1);
        }
        return findSecondSmallestMin(array, mid + 1, low);
    }


}
