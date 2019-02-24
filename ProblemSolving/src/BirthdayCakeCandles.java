import java.util.Arrays;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] ar = {1,1,2,4,6,5,8,8,8,9,9,6,9,9};
        System.out.println(birthdayCakeCandles(ar));
    }

    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int count = 1;
        for (int i = ar.length-1; i > 0 ; i--) {
            if(ar[i] == ar[i-1]) {
                count += 1;
            } else {
                break;
            }
        }
        return count;
    }
}
