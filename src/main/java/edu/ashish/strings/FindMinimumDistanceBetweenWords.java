package edu.ashish.strings;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class FindMinimumDistanceBetweenWords {
    public static void main(String[] args) {
        String str = "ABC is XYZ and ABC & XYZ";
        String word1="ABC";
        String word2="XYZ";
        String[] splits = str.split(" ");
        int index = 0;
        int index1 = Integer.MAX_VALUE, index2 = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        for(String s : splits) {
            if(word1.equals(s)) {
                if(s.length()%2 == 0) {
                    index1 = index + (s.length() / 2);
                } else {
                    index1 = index + (s.length() / 2 + 1);
                }
                if(Math.abs(index1 - index2) < result) {
                    result = Math.abs(index1 - index2);
                }
            } else if(word2.equals(s)) {
                if(s.length()%2 == 0) {
                    index2 = index + (s.length() / 2);
                } else {
                    index2 = index + (s.length() / 2 + 1);
                }
                if(Math.abs(index1 - index2) < result) {
                    result = Math.abs(index1 - index2);
                }
            }
            index += s.length() + 1;
        }
        System.out.printf("The minimum distance between %s and %s is %d \n", word1, word2, result);
    }
}
