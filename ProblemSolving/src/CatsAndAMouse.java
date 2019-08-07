import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class CatsAndAMouse {
    public static void main(String[] args) {

        System.out.println(catAndMouse(11,6,4));
        System.out.println(countHUFChange(1122, 1500));

    }
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(z - x) < Math.abs(z - y)) {
            return "Cat A";
        } else if (Math.abs(z - y) < Math.abs(z - x)) {
            return "Cat B";
        }
        return "Mouse C";
    }

    static Map<Integer, Integer> countHUFChange(int total, int payment){
        int change = payment - total;
        int[] denominations = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
        Map<Integer, Integer> changeMap = new HashMap<>();
        for (int d : denominations) {
            if (change / d >= 1) {
                changeMap.put(d, change / d);
                change = change % d;
            }
        }
        return changeMap;
    }
}