package edu.ashish.strings;

import java.util.*;

/**
 * Created by abha51 on 10/4/2017.
 */
public class FindAllLargestSubStringUniqueCharacters {

    public static void main(String... args) {

//        String str = "GeeksForGeeks";
        String str = "ABCDABDEFGCABD";
//        System.out.println(lengthOfLongestSubstring(str));
        Map<Integer, List<Set<Character>>> map = new TreeMap<>();
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> subSet = new LinkedHashSet<>();
        int count = 0;
        for(char c : str.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
                count++;
            } else {
                if(map.keySet().size() > 0) {
                    int subStringCount = map.keySet().iterator().next();
                    if(subStringCount < set.size()) {
                        map.keySet().remove(subStringCount);
                        List<Set<Character>> list = new ArrayList<>();
                        list.add(set);
                        map.put(set.size(), list);
                        if(c == set.iterator().next()) {
                            set = new LinkedHashSet<>(set);
                            set.remove(set.iterator().next());
                            set.add(c);
                            map.get(set.size()).add(set);
                        }
                    } else if (subStringCount == set.size() && c == set.iterator().next()) {
                        set = new LinkedHashSet<>(set);
                        set.remove(set.iterator().next());
                        set.add(c);
                        map.get(subStringCount).add(set);
                    } else {
                        set = new LinkedHashSet<>();
                        set.add(c);
                    }
                } else {
                    List<Set<Character>> list = new ArrayList<>();
                    list.add(set);
                    map.put(set.size(), list);
                    set = new LinkedHashSet<>();
                    set.add(c);
                }
                /*if(set.size() >= subSet.size()) {
                    subSet.clear();
                    subSet.addAll(set);
                    set.clear();
                    set.add(c);
                }*/
            }
        }
        System.out.println("Length of longest substring with unique characters is: " + map.entrySet().iterator().next().getKey());
        for(Map.Entry<Integer, List<Set<Character>>> entry: map.entrySet()) {
            for(Set<Character> subStringSet: entry.getValue()) {
                System.out.println("Longest substring with unique characters is: " + subStringSet);
            }
        }

    }

    /*public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(set.toString());
        return ans;
    }*/
}
