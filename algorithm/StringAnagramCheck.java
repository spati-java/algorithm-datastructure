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

        String sortedStr1 = "";
        String sortedStr2 = "";

        for (char c : text1Array) {
            sortedStr1 += c;
        }
        for (char c : text2Array) {
            sortedStr2 += c;
        }

        return sortedStr1.equals(sortedStr2);
    }
}