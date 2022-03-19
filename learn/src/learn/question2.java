package learn;
import java.util.*;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,2,3,54,1,6,7,7};
		int sum=0;
		Arrays.sort(a);
		List<Integer>ans=new ArrayList<Integer>();
		for(int i:a) {
			if(!ans.contains(i)) {
				ans.add(i);
			}
		}
		
		for(int i:ans) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		
		if(sum==0) {
			System.out.println("Answer: -1");
		}else {
			System.out.println("Answer: "+sum);
		}

	}

}
