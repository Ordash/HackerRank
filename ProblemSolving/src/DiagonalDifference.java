public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] arr = {{6,7,8}, {6,9,7}, {5,3,9}};
        System.out.println(diagonalDifference(arr));
    }

    //arr.length == number of rows
    static int diagonalDifference(int[][] arr) {
        int sumLeftToRight = 0;
        int sumRightToLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeftToRight += arr[i][i];
            sumRightToLeft += arr[i][(arr.length-1)-i];
        }
        return Math.abs(sumLeftToRight-sumRightToLeft);
    }
}
