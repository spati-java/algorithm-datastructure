public class PrimeNumber{
	
	public static void main(String [] args){

			System.out.print(prime(1));
	}

	public static boolean prime(int n){

		boolean isPrime = true;

		if(n == 1 || n == 2){
			
			return isPrime;
		}

		for( int i = 2; i< n; i++ ) {

			if( n % i == 0){
				isPrime = false ;
				break;
			}
				
		}
		return isPrime;
	}
		
}