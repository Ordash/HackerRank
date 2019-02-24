import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        List<Integer> alice =Arrays.asList(40,50,60);
        List<Integer> bob =Arrays.asList(20,60,700);
        System.out.println(compareTriplets(alice, bob));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoints = 0;
        int bPoints = 0;
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aPoints += 1;
            } else if (!(a.get(i).equals(b.get(i)))){
                bPoints += 1;
            }
        }
        scores.add(aPoints);
        scores.add(bPoints);
        return scores;
    }
}
