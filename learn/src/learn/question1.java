package learn;
import java.util.*;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		
		System.out.println("Answer: "+sum);
		
		
	}

}
