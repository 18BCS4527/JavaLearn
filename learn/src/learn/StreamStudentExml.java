package learn;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamStudentExml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Student,Student>f=st->{
			if(st.id>4527) {
				st.id=st.id+10;
			}
			return st;
		};
		Student s=new Student(4527,"Dinesh Reddy");
		Student s1=new Student(4547,"Siddu");
		Student s2=new Student(4548,"Rohith Reddy");
		Student s3=new Student(4557,"Aravind");
		List<Student>ts=new ArrayList();
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);
		System.out.println();
		Stream str= ts.stream();	
		List<Student>result=(List<Student>) str.map(f).collect(Collectors.toList());
		System.out.println(result);
	}

}
