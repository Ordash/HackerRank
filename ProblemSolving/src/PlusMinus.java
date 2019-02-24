public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 6, 8, -4, -2, -5};
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i : arr) {
            if (i > 0) {
                positive += 1;
            } else if (i != 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }
        System.out.println(positive / arr.length);
        System.out.println(negative / arr.length);
        System.out.println(zero / arr.length);
    }
}
