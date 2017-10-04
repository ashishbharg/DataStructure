package edu.ashish.array;

import java.util.Arrays;

/**
 * Created by abha51 on 10/4/2017.
 */
public class SmallestElementInAray {

    public static void main(String... args) throws Exception {

        int[] array = new int[] {13, 2, 1, 5, 10};

        //Approach 1
        int[] intArray = Arrays.stream(array).sorted().toArray();
        System.out.println("2nd smallest number using Streams API is: " + intArray[1]);

        //Approach 2
        int lowest, secondLowest;
        lowest = secondLowest = Integer.MAX_VALUE;

        if(array.length < 2) {
            throw new Exception("Array minimum size has to be 2.");
        }

        array = new int[]{3, 4, 4, 5, 7, 10, 8};
        for(int i=0; i<array.length; i++) {
            if(array[i] < lowest) {
                secondLowest = lowest;
                lowest = array[i];
            } else if(array[i] < secondLowest) {
                secondLowest = array[i];
            }
        }
        System.out.println("Smallest element in array is: " + lowest);
        System.out.println("Second smallest element in array is: " + secondLowest);
    }
}
