import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long minSum = sum - arr[arr.length - 1];
        long maxSum = sum - arr[0];
        System.out.println(minSum + " " + maxSum);
    }
}
