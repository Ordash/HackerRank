import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {

        System.out.println(birthday(Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1), 18, 7));

    }

    static int birthday(List<Integer> s, int d, int m) {
        int total = 0;
        int tempSum = 0;
        if(s.size() == 1 && s.get(0) == d) {
            return 1;
        }
        for (int i = 0; i <= s.size() - m; i++) {
            for (int j = 0; j < m; j++) {
                tempSum += s.get(i+j);
            }
            if(tempSum == d) {
                total++;
            }
            tempSum = 0;
        }
        return total;
    }
}
