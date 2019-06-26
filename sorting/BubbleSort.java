import java.util.*;

public class BubbleSort{

    public static void main(String [] args){
        
        int [] array = {2,4,1,3,5,7,6};
        
        int [] sortedArray = bubbleSort(array);

        System.out.println(Arrays.toString(sortedArray));

    }

    public static int [] bubbleSort(int [] array){
        int temp = 0;
        for(int i = 0; i < array.length; i++){

            for(int j = i+1; j<array.length; j++){

                if(array[i] >  array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;

    }

}