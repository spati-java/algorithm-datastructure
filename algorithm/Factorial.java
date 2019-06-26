public class Factorial{

    public static void main(String [] args){
        System.out.print(factorial(5));
    }
    
    public static int factorial( int n ){
        if(n == 0 || n == 1)
        return n;

        else 
        return factorial(n-1) * n;
    }
}
