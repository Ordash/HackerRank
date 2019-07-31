
import java.util.Arrays;
import java.util.List;

public class BonAppetit {
    public static void main(String[] args) {
        List<Integer> billItems = Arrays.asList(3, 10, 2, 9);

        bonAppetit(billItems, 1, 12);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int billTotal = bill.stream().mapToInt(Integer::intValue).sum();
        int billActual = (billTotal - bill.get(k)) / 2;
        System.out.println(b - billActual > 0? b - billActual: "Bon Appetit");
    }
}
