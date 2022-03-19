package learn;
import java.util.*;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class SetStudentExml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(4527,"Dinesh Reddy");
		Student s1=new Student(4547,"Siddu");
		Student s2=new Student(4548,"Rohith Reddy");
		Student s3=new Student(4557,"Aravind");
		Set<Student>ts=new HashSet();
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);

	}

}
