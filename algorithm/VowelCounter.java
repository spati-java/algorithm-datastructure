public class VowelCounter {

    public static void main(String[] args) {

        String text = "Hello world I am a disco dancer";
        countVowel(text);

        System.out.print(countVowel(text));
    }

    public static int countVowel(String text) {

        if (null == text) {
            return 0;
        }
        int count = 0;
        char[] charArray = text.toLowerCase().toCharArray();
        for (char c : charArray) {

            switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                count++;

            default:
            }
        }
        return count;
    }

}