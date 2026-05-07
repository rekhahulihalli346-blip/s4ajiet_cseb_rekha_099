package divide;

public class armstrong {
	 public static void main(String[] args) {
	int num=153;
	int temp=num;
	int sum=0;
	while(num>0) {
		int digit=num%10;
		sum=sum+digit*digit*digit;
		num=num/10;
	}
	if(sum==temp)
		System.out.println("Armstrong");
	else 
		System.out.println("Not armstrong");
	
	}
}
