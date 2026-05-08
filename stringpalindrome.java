package divide;

public class stringpalindrome {
	public static void main(String [] args) {
	String s="madam";
	StringBuilder sb= new StringBuilder(s);
	sb.reverse();
	String rev=sb.toString();
	if(s.equals(rev)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	}
}
