import java.util.Arrays;

public class StringAnagramCheck {

    public static void main(String[] args) {
        System.out.print(isAnagram("abc", "cab"));
    }

    public static boolean isAnagram(String text1, String text2) {

        if (text1 == null || text2 == null) {
            return false;
        }

        if (text1.length() != text2.length()) {
            return false;
        }

        char[] text1Array = text1.toCharArray();
        char[] text2Array = text2.toCharArray();

        Arrays.sort(text1Array);
        Arrays.sort(text2Array);

        return Arrays.equals(text1Array, text2Array);
    }
}