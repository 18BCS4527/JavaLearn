package learn;

import java.util.ArrayList;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> al=new HashSet();
		al.add("Dinesh Reddy");
		al.add("Rakesh");
		al.add("Vikash");
		al.add("Rakesh");
		System.out.println(al);
		// Unorder list 
		// Duplicate  values not allowed
		
		LinkedHashSet<String>hs=new LinkedHashSet();
		hs.add("Rakesh");
		hs.add("Dinesh Reddy");
		hs.add("Vikash");
		hs.add("Rakesh");
		System.out.println(hs);
		//It's an ordered list
		// But not Sorted list 
		// Duplicate  values not allowed
		
		TreeSet<String>ts=new TreeSet();
		ts.add("Rakesh");
		ts.add("Dinesh Reddy");
		ts.add("Vikash");
		ts.add("Rakesh");
		System.out.println(ts);
		// It's an Sorted list 
		// Duplicate  values not allowed

	}

}
