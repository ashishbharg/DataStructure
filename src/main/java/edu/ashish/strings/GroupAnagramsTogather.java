package edu.ashish.strings;

import java.util.*;

/**
 * Created by abha51 on 10/4/2017.
 */
public class GroupAnagramsTogather {

    public static void main(String... args) {

        String[] words = new String[]{"cat", "dog", "tac", "god", "act"};

        Map<String, Set<String>> map = new HashMap<>();
        for(String word: words) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            if(null == map.get(key)) {
                Set<String> set = new HashSet<>();
                set.add(word);
                map.put(key, set);
            } else {
                map.get(key).add(word);
            }
        }

        for(Map.Entry<String, Set<String>> entry: map.entrySet()) {
            for(String value: entry.getValue()) {
                System.out.print(value + " ");
            }
        }
    }
}
