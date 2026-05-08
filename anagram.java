package divide;

public class anagram {
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		if(s1.length()==s2.length()) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}
}
