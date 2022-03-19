package learn;
import java.util.*;
import java.util.Arrays;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]= {10,15,20,25,30,100};
		int n,sum=0;
		System.out.println("Enter thenumber: ");
		n=s.nextInt();
		Arrays.sort(a);
		for(int i:a) {
			if(i>n) {
				sum=sum+i;
			}
		}
		System.out.println("Answer: "+sum);
		

	}

}
