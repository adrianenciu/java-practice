package com.adrianenciu;

import java.util.HashMap;
import java.util.Map;

public class StringMain {

    public static void main(String[] args) {
        String name = "this is a random string";
        System.out.println(findIfStringHasAllUniqueCharsUsingIndexOf(name));
        System.out.println(findIfStringHasAllUniqueCharsUsingAdditionalDataStructures(name));
        System.out.println(findIfStringHasAllUniqueCharsWithTwoFors(name));
    }

    public static boolean findIfStringHasAllUniqueCharsUsingIndexOf(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (s.indexOf(currentCharacter) != -1) {
                if (s.indexOf(currentCharacter) != s.lastIndexOf(currentCharacter)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean findIfStringHasAllUniqueCharsWithTwoFors(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean findIfStringHasAllUniqueCharsUsingAdditionalDataStructures(String s) {
        Map<String, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if (charCountMap.get(key) == null) {
                charCountMap.put(key, 1);
            } else {
                charCountMap.put(key, charCountMap.get(key) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }

}
