package Arrays;

public class LeftRotation {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3};

        int[] result = rotLeft(arr2, 2);


        for (int value : result) {
            System.out.println(value);
        }

    }

    static int[] rotLeft(int[] a, int d) {
        int[] returnArr = new int[a.length];
        if(d == a.length){
            return a;
        }
        int i = 0;
        int j = 0;
        while(i + d < a.length) {
            returnArr[i] = a[i + d];
            i++;
        }
        while(i < a.length) {
            returnArr[i] = a[j];
            i++;
            j++;
        }
        return returnArr;

    }

}
