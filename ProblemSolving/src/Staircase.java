public class Staircase {
    public static void main(String[] args) {
        int n = 99;
        long s1 = staircase1(n);
        long s2 = staircase2(n);
        System.out.println("With nested for loop: " + s1);
        System.out.println("With two separate for loops: " + s2);
    }

    static long staircase1(int n) {
        long start = System.currentTimeMillis();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if(i <= j){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return System.currentTimeMillis() - start;
    }

    static long staircase2(int n) {
        long start = System.currentTimeMillis();
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            spaces.append(" ");
        }
        String customChar = "#";
        for (int i = 0; i < n; i++) {
            System.out.print(spaces);
            System.out.print(customChar);
            if (spaces.length() > 0) {
                spaces.deleteCharAt(spaces.lastIndexOf(" "));
            }
            customChar += "#";
            System.out.println();
        }
        return System.currentTimeMillis() - start;
    }
}
