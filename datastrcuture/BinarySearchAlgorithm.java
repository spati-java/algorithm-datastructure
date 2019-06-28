public class BinarySearchAlgorithm{

        public static void main(String [] args){
                int [] a = {1,2,3,4,5,6,6,7,9,10};
                int result = binarySearch(a,9);
                System.out.println(result);
        }

        public static int binarySearch(int [] a, int num){
            int index = -1;
            
            int mid = a.length / 2;

            if(a[mid] == num){
                index = mid;
                            
            }
            for(int i = 0; i <mid; i++){

                if(a[i] == num){
                    index = i;
                    break;
                }

            }

            for(int i = mid; i < a.length; i++){   
                if(a[i] == num){
                    index = i;
                    break;
                }

            }
            return index;
        }   
}