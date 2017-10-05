package edu.ashish.strings;

/**
 * Created by ashish.bhargava on 10/5/2017.
 */
public class LongestPalindromeInString {

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println("Longest palindrome in " + str + " is: " + longestPalindrome(str));
    }

    private static String longestPalindrome(String s) {
        if(null == s) {
            return "";
        }
        String longest = s.substring(0,1);
        for(int i=0; i<s.length()-1; i++) {
            String palindrome = intermediatePalindrome(s, i, i);
            if(palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            palindrome = intermediatePalindrome(s, i, i+1);
            if(palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }

    private static String intermediatePalindrome(String s, int left, int right) {
        if(left > right) {
            return null;
        }
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}
