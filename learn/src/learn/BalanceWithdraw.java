package learn;

import java.util.Scanner;

public class BalanceWithdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the withdraw amount: ");
		int a=s.nextInt();
		
		TestBalance tb=new TestBalance();
		try {
			tb.check(8000, a);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
