package edu.ashish.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ashish.bhargava on 10/6/2017.
 */
public class FindCharacterFrequency {

    public static void main(String[] args) {
        String str = "SSSSSTTPPQ";

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch: str.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.print(entry.getValue()+String.valueOf(entry.getKey()));
        }
    }
}
