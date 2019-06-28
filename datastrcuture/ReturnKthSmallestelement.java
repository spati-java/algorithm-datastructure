import java.util.*;

public class  ReturnKthSmallestelement{


    public static void main(String [] args) {
        int [] arra = {7, 10, 4, 3, 20, 15};
        System.out.println(findKathsSmallestElm(arra,3));
    }

    public static int findKathsSmallestElm(int [] array, int k){

        Arrays.sort(array);
        return array[k-1];
    }

    
}