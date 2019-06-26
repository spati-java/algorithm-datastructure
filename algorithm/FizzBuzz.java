public class FizzBuzz{

    public static void main(String [] arags){

        printFizzBuzz(35);

    }

    public static void printFizzBuzz(int number){
        if( number%3 == 0 && number%5 == 0){
            System.out.println("Fizz Buzz");
        }

        else if (number%3 == 0){
            System.out.println("Fizz");
        }

        else if(number%5 == 0){
            System.out.println("BUzz");
        }

        else 
        System.out.println("Number is not divisible by any of the numbers");
    }
}