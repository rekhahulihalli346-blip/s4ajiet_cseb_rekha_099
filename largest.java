package divide;

public class largest {
	public static void main(String[] args) {
		int num=5892;
		int max=0;
		while(num>0) {
			int digit=num%10;
			if(digit>max) {
				max=digit;
			}
			num=num/10;
		}
		System.out.println("largest digit:"+max);
	}
}
