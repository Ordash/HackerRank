import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards = {3,1,5,6,9};
        int[] drives = {5,2,8};
        System.out.println(getMoneySpent(keyboards, drives, 10));

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int[] reversedOrderKeyboards = new int[keyboards.length];
        Arrays.sort(keyboards);
        for (int i = 0, j = keyboards.length -1; i < keyboards.length; i++) {
            reversedOrderKeyboards[i] = keyboards[j];
            j--;
        }
        Arrays.sort(drives);
        int total = -1;
        for (int i = 0; i < reversedOrderKeyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if(reversedOrderKeyboards[i] + drives[j] > b){
                    break;
                }
                if(reversedOrderKeyboards[i] + drives[j] > total){
                    total = reversedOrderKeyboards[i] + drives[j];
                }
            }
        }
        return total;
    }
}
/*
* 17
* 3,5,7,11
* 13,17,23,51
*
* 10
* 9,6,5,3,1
* 8,5,2
* */

