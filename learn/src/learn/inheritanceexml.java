package learn;

class AA{
	String name;
	AA(){
		name="Dinesh Reddy";
	}
	
}

class BB extends AA{
	int age;

	BB(){
		age=21;
	}
}

public class inheritanceexml {

	public static void main(String[] args) {
		BB b=new BB();
		System.out.println("Access from class A: "+b.name);
		//here we are getting variable access to the drived calss.
		
	}
}
