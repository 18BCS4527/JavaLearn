package learn;

import java.util.ArrayList;
import java.util.*;

class EmplSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return -o1.name.compareTo(o2.name);
	}
	
}
public class CollectionsComparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>al=new ArrayList();
		Employee e=new Employee("Dinesh Reddy","Development",100);
		Employee e1=new Employee("Rakesh Kumar","FrontEnd",10);
		Employee e2=new Employee("Aravind Babu","BackEnd",50);
		Employee e3=new Employee("Siddu","Testing",60);
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println("Before Sorting the list");
		al.forEach((k)->System.out.println(k.name));
		System.out.println("After Sorting the list");
		EmplSort es=new EmplSort();
		Collections.sort(al, es);
		al.forEach((k)->System.out.println(k.name));

	}

}
