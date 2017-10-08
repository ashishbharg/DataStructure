package edu.ashish.strings;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class AsciiToInteger {

    public static void main(String[] args) {

        String str = "Ashish";
        System.out.println(atoi(str));
    }

    private static int atoi(String str) {

        int result = 0;
        if(null != str && !str.trim().isEmpty()) {
            for (char ch : str.toCharArray()) {
                result = result * 10 + ch -'0';
            }
        }
        return result;
    }
}
