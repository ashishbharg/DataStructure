package edu.ashish.strings;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class FindLongestRepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabbbbccdd";

        findLongestRepeatingString(str);
    }

    private static void findLongestRepeatingString(String str) {

        String longestString = "";
        int longestStartingIndex = 0;
        int startingIndex = 0;
        int length = 0;
        char ch;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                length++;
                continue;
            } else if(str.substring(startingIndex, startingIndex + length + 1).length() > longestString.length()) {
                longestString = str.substring(startingIndex, startingIndex + length + 1);
                longestStartingIndex = startingIndex;
                startingIndex = i + 1;
                length = 0;
            }
        }
        System.out.println("Longest Repeating String is: " + longestString);
        System.out.println("Starting index of longest string is " + longestStartingIndex + " and length is " + longestString.length());
    }
}
