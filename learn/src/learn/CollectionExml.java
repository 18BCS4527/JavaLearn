package learn;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList();
		al.add("Dinesh Reddy");
		al.add("Rakesh");
		al.add("Vikash");
		
		Iterator i=al.iterator();
		while(i.hasNext())
			System.out.println("Iterator Elements: "+i.next());
		
		for(String s:al) {
			System.out.println("Here is the element: "+s);
		}
		
		al.forEach((e)->System.out.println(e));

	}

}
