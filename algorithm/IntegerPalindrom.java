class IntegerPalindrom {

    public static void main(String [] args) {
        
        reverse(31);

    }

    public static void reverse(int number) {

        int rev = 0 , rem = 0;
        int temp = number;
        while(temp != 0){

            rem = temp%10;
            rev = rem*10 + rem;
            temp = temp/10;
        }
        if(rev == number){

            System.out.print("Palindrom");
        }
        else System.out.print("Not a plandrome");
    }


}
 

