import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CatsAndAMouse {
    public static void main(String[] args) {

        System.out.println(catAndMouse(11,6,4));

    }
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(z - x) < Math.abs(z - y)) {
            return "Cat A";
        } else if (Math.abs(z - y) < Math.abs(z - x)) {
            return "Cat B";
        }
        return "Mouse C";
    }

}