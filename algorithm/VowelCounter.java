public class VowelCounter {

    public static void main(String[] args) {

        String text = "Hello world I am a disco dancer";
          countVowel(text);

          System.out.print(countVowel(text));
    }

    public static int countVowel(String text){
              int count = 0;
              char [] charArray = text.toCharArray();
                for(char c: charArray){

                    switch(c){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                         count ++;
                    break;
                    default: 
                    }
                }
                return count;
        }

}