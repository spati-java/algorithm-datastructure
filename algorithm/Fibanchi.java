public class Fibanchi {

	public static void main(String [] args) {
		
		for(int i = 1 ; i < 100; i++){

			System.out.print(printFibonachi(i) + " , ");
		}

	}

	public static int printFibonachi(int n){

			if(n == 1 || n == 2 ) {
				
				return 1;
			}
			
			return printFibonachi(n-1) + printFibonachi(n-2);
	}
}

