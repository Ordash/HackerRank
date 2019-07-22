package Arrays;

import java.util.*;

public class SockMerchant {

    public static void main(String[] args) {

        int n = 8;
        int[] ar = {1,2,5,2,6,7,7,1};
        //int[] ar = {1, 1, 1, 1, 1, 1, 1, 1};

        System.out.println(sockMerchant(n, ar));

    }
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> sockMap = new HashMap<>();
        int sockPairs = 0;
        for (int i = 0; i < n; i++) {
            Integer c = sockMap.get(ar[i]);
            if (sockMap.get(ar[i]) == null) {
                sockMap.put(ar[i], 1);
            } else {
                sockMap.put(ar[i], ++c);
            }
        }
        for (Object o : sockMap.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            Integer totalCountOfSock = (Integer) pair.getValue();
            sockPairs += totalCountOfSock / 2;
        }
        return sockPairs;
    }
}