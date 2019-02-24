import java.math.BigInteger;

public class VeryBigSum {

    public static void main(String[] args) {
        long[] ar = {1000000223232L,100000223232L,232323232232L};
        System.out.println(aVeryBigSum(ar));
    }

    static long aVeryBigSum(long[] ar) {
        Long sum = 0L;
        for (Long l :ar) {
            sum += l;
        }
        return sum;
    }
}
