package learn;
import java.util.*;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0,b=1,c,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			sum=c+sum;
			System.out.println(c);
			
		}
		
		System.out.println("Answer:"+sum);

	}

}
