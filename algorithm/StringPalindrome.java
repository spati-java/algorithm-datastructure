public class StringPalindrome {

    public static void main(String [] args) {
        
        System.out.print(isPalindrom("DOB"));
    }

    public static boolean isPalindrom(String word){
            
            boolean isPalindrome = true;

            if( word == null){
                
                isPalindrome = false;
                return isPalindrome;
            }
            else {
                return word.equals(reverse(word));
            }
    }


    public static String reverse(String word){

        String s = "";

        char [] charsAray = word.toCharArray();

        for(int i = charsAray.length - 1; i >= 0; i-- ){
                s += charsAray[i];
        }

        return s;
    }
}