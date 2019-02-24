public class SimpleArraySum {
    public static void main(String[] args) {

        int[] ar = {1,5,7};
        System.out.println(simpleArraySum(ar));
    }

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i:ar) {
            sum += i;
        }
        return sum;
    }
}
