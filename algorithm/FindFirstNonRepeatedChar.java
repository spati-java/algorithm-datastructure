
import java.util.*;
public class FindFirstNonRepeatedChar {

    // find the first unique character.
    public static void main(String [] args) {   

        char [] charArray = {'c','b','d','e','b','e','c','d','f'};

        LinkedHashMap<Character,Integer> map = new LinkedHashMap();
        
        for (char c : charArray){
                
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else
            map.put(c, 1);
        }

        Set<Character> keySets = map.keySet();

        for(Character c : keySets){
            int count  = map.get(c);
            if(count == 1){
                System.out.println( "  " + c);
            }
        }

    }

   


}