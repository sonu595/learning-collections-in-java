package dsa.String;

import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "aabbccs";
        String s2 = "aabsbcc";
        boolean isAnagram = true;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();


        // put in hashmap 
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) +1);
            } else {
                map.put(ch, 1);
            }
            count++;
        }

        // remove from hashmap 
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) -1);
            }
            count--;
        }
        if (count != 0) {
            isAnagram = false;
        } else {
            isAnagram = true;
        }
        if (isAnagram) {
            System.out.println("The String is anagram ");
        } else {
            System.out.println("String is not anagram");
        }
    }
}
