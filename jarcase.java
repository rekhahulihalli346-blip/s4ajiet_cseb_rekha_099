package divide;

import java.util.Scanner;

public class jarcase {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=10;
		int K=5;
		int Candies=10;
		int order=sc.nextInt();
		if(order>Candies || Candies-order<K) {
			System.out.println("invalid input");
		}
		else {
			Candies=Candies-order;
			System.out.println("Number of candies sold: " +order);
			System.out.println("Number of candies available: "+Candies);
		}
				
	}
}
