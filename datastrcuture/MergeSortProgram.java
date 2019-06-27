import java.util.Arrays;

public class MergeSortProgram{

    public static void mergesort(int [] ar, int n){

        if(n < 2){
            return ;
        }
        // craete two arrays
        int middle = n/2;
        int [] l = new int [middle];
        int [] r = new int [n - middle];

        // copy element from the left side of the array
        for(int i = 0; i< middle; i ++){
            l[i] = ar[i];
        }

        // copy element from the  right side of the array
        for(int j = middle; j<n; j++ ){
            r[j-middle] = ar[j];
        }

        mergesort(l,middle);
        mergesort(r, n-middle);
        merge(ar,l, r,middle,n - middle);

    }

    public static void merge(int [] ar,int [] ar1, int [] ar2 , int left, int right){
        int i = 0, j = 0, k = 0;

        //int [] temp = new int [left + right];

        while(i < left && j < right){

            if(ar1[i] > ar2[j]){
                ar[k++] = ar2[j++];
            }
            else ar[k++] = ar1[i++];
        }

        while(i < left){
            ar[k++] = ar1[i++];
        }

        while(j < right){
            ar[k++] = ar2[j++];
        }
    }

    public static void main(String[] args) {
        
        int ar1[] = { 1, 4, 3, 2, 5,6,5,7,7,1,9 };
        mergesort(ar1, ar1.length);

        System.out.println(Arrays.toString(ar1));
    }

}