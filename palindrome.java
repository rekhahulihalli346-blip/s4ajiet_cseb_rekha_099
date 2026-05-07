package divide;

public class palindrome {
	    public static void main(String[] args) {

	        int n = 121;
	        int rev = 0;
	        int last;
	        int temp = n;

	        while(n > 0) {
	            last = n % 10;
	            rev = rev * 10 + last;
	            n = n / 10;
	        }

	        if(temp == rev) {
	            System.out.println("Palindrome Number");
	        } else {
	            System.out.println("Not Palindrome Number");
	        }
	    }
	}

