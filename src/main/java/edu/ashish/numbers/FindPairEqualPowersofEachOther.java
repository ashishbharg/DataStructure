package edu.ashish.numbers;

/** a^b = b^a
 * Created by ashish.bhargava on 10/6/2017.
 */
public class FindPairEqualPowersofEachOther {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,7,8,9,10,11,12,13,14};

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(Math.pow(arr[i], arr[j]) == Math.pow(arr[j], arr[i])) {
                    System.out.format("%d ^ %d = %d ^ %d", arr[i], arr[j], arr[j], arr[i]);
                }
            }
        }

    }
}
