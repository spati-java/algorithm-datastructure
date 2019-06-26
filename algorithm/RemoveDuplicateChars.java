import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateChars {

    public static void main(String[] s) {

        char[] duplicateCharArrays = { 'a', 'b', 'c', 'd', 'e', 'c' };

        removeDuplicate(duplicateCharArrays);
    }

    public static void removeDuplicate(char[] arras) {

        HashSet set = new HashSet<>();

        Object[] distinctarray = new Object[arras.length];

        for (char c : arras) {
            set.add(c);
        }

        distinctarray = set.toArray();

        System.out.print(Arrays.toString(distinctarray));
    }
}