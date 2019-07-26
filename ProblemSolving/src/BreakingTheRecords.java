import java.util.Arrays;

public class BreakingTheRecords {
    public static void main(String[] args) {

        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        Arrays.stream(breakingRecords(scores)).forEach(System.out::println);
    }

    static int[] breakingRecords(int[] scores) {

        int maxScore = scores[0];
        int minScore = scores[0];
        int breakMaxCount = 0;
        int breakMinCount = 0;
        for (int i = 1; i < scores.length ; i++) {
            if(scores[i] > maxScore) {
                breakMaxCount += 1;
                maxScore = scores[i];
            }
            if(scores[i] < minScore){
                breakMinCount += 1;
                minScore = scores[i];
            }
        }

        return new int[]{breakMaxCount,breakMinCount};

    }
}
