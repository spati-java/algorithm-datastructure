public class FindMissingNumberInAnArray {

    public static void main(String[] args) {
        int[] missingNumberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 13, 15, 16, 19, 17, 20 };

        findMissingNumber(missingNumberArray);
    }

    public static void findMissingNumber(int[] array) {

        int sum = 0;
        int expectedSum = 0;
        int missingNumber = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        for (int j = 1; j <= 20; j++) {
            expectedSum += j;
        }

        missingNumber = expectedSum - sum;

        System.out.println(missingNumber);

    }
}