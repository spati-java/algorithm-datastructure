public class Fibanchi {

	public static void main(String [] args) {
		
		printFibonachi(100);

	}

	public static int printFibonachi(int n){

			if(n == 0 )
				return 0;
			if(n == 1)
				return 1;
			else 
				System.out.print(n + " , ");
				return printFibonachi(n-1) + printFibonachi(n-2);
	}
}


