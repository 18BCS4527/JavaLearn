package learn;
import java.util.*;

class Employee{
	
	String name;
	String dept;
	int salary;
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
}
public class EmplCollection {

	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList();
		Employee e=new Employee("Dinesh Reddy","Development",100);
		Employee e1=new Employee("Rakesh Kumar","FrontEnd",10);
		Employee e2=new Employee("Aravind Babu","BackEnd",50);
		Employee e3=new Employee("Siddu","Testing",60);
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.forEach((k)->System.out.println(k.name));
		Collections.sort(al, (s1,s2)->s1.name.compareTo(s2.name));
		System.out.println("After the sort");
		al.forEach((k)->System.out.println(k.name));
		
		
	}
}
