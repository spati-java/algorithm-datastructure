import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void merge(int[] ar1, int[] ar2) {

        int i = 0, j = 0, k = 0;

        int[] temp = new int[ar1.length + ar2.length];

        while (i < ar1.length && j < ar2.length) {

            if (ar1[i] < ar2[j]) {
                temp[k++] = ar1[i++];
            } else {
                temp[k++] = ar2[j++];
            }

        }

        while(i < ar1.length){
            temp[k++] = ar1[i++];
        }

        while(j < ar2.length){ 
            temp[k++] = ar2[j++];
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {

        int ar1[] = { 1, 2, 3, 3, 5 };
        int ar2[] = { 6, 7, 8, 9 };

        merge(ar1,ar2);
    }

}