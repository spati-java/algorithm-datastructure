import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5, 6 };
        int[] revseredArray = reverseArra(originalArray);
        System.out.println(Arrays.toString(revseredArray));
    }

    public static int[] reverseArra(int[] originalArray) {

        for (int i = 0; i < originalArray.length / 2; i++) {

            int temp = originalArray[(originalArray.length - 1) - i];

            originalArray[(originalArray.length - 1) - i] = originalArray[i];
            originalArray[i] = temp;

        }

        return originalArray;
    }
}