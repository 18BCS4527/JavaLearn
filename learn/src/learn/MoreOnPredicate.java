package learn;

import java.util.function.Predicate;

public class MoreOnPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p1=n->n%2==0;
		Predicate<Integer>p2=n->n>20;
		
		System.out.println("Let's Check: "+p1.and(p2).test(20));

	}

}
