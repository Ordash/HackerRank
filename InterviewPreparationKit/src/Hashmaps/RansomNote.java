package Hashmaps;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "one", "grand", "today", "night" };
        String[] note = {"give", "one", "grand", "today" };

        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> magazineMap = new HashMap<>();
        for (String m : magazine) {
            magazineMap.put(m, magazineMap.getOrDefault(m, 0) + 1);
        }
        String answer = "Yes";
        for (String n :note) {
            if(magazineMap.containsKey(n)) {
                int counter = magazineMap.get(n) - 1;
                if(counter == 0) {
                    magazineMap.remove(n);
                } else {
                    magazineMap.put(n, counter);
                }
            } else {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
    }
}
