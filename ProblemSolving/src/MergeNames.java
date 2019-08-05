import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeNames {

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia","Evelin","Evelin"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma","Evelin"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Stream allNames = Stream.concat(Arrays.stream(names1), Arrays.stream(names2));
        return (String[]) allNames.distinct().toArray(String[]::new);
    }
}
