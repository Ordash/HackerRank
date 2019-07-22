package Hashmaps;

import java.util.HashMap;

public class TwoStrings {
    public static void main(String[] args) {

        String s1 = "He";
        String s2 = "World";
        System.out.println(twoStrings(s1,s2));
    }

    static String twoStrings(String s1, String s2) {
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                return "YES";
            }
        }
        return "NO";

    }
}
