package edu.ashish.strings;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Created by abha51 on 10/4/2017.
 */
public class FirstUniqueCharacter {

    public static void main(String... args) {

//        String str = "GeeksForGeeks";
        String str = "GeeksQuiz";

        Map<Character, Boolean> map = new LinkedHashMap<>();
        char[] letters = str.toCharArray();
        for(char c: letters) {
            if(!map.keySet().contains(c)) {
                map.put(c, false);
            } else if (false == map.get(c)){
                map.put(c, true);
            }
        }
        boolean isUniqueCharacterPresent = false;
        for(Map.Entry<Character, Boolean> entry: map.entrySet()) {
            if(false == entry.getValue()) {
                System.out.print("First unique character in string is: " + entry.getKey());
                isUniqueCharacterPresent = true;
                break;
            }
        }
        if(!isUniqueCharacterPresent) {
            System.out.print("No unique character is present in the string:" + str);
        }
    }
}
