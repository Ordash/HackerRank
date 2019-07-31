public class DrawingBook {
    public static void main(String[] args) {

        System.out.println(pageCount(16,8));
    }

    static int pageCount(int n, int p) {
        int totalPageTurn = n / 2;
        int pageTurnWhereThePageIs = p / 2;
        if(totalPageTurn - pageTurnWhereThePageIs > totalPageTurn / 2) {
            return pageTurnWhereThePageIs;
        }
        return totalPageTurn - pageTurnWhereThePageIs;
    }
}
