import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,2,4,3,2,1,1,2,4,4,4);
        System.out.println(migratoryBirds2(arr));

    }

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> idFreqMap = new LinkedHashMap<>();

        for (int i : arr) {
            int tempCount = idFreqMap.getOrDefault(i, 0);
            tempCount++;
            idFreqMap.put(i, tempCount);
        }
        int highestFrequency = 0, idOfMostFrequent = 0;
        for (Map.Entry<Integer, Integer> e : idFreqMap.entrySet()) {
            if(e.getValue() > highestFrequency) {
                highestFrequency = e.getValue();
                idOfMostFrequent = e.getKey();
            }
            if(e.getValue() == highestFrequency && e.getKey() < idOfMostFrequent) {
                idOfMostFrequent = e.getKey();
            }
        }
        return idOfMostFrequent;
    }

    static int migratoryBirds2(List<Integer> arr) {
        int[] freqArr =  new int[arr.size() + 1];
        for (int id : arr) {
            freqArr[id]++;
        }
        int maxFreq = 0, idOfMostFreq = 0;
        for (int i = 1; i < arr.size() + 1; i++) {
            if(freqArr[i] > maxFreq) {
                maxFreq = freqArr[i];
                idOfMostFreq = i;
            }
        }
        return idOfMostFreq;
    }
}
