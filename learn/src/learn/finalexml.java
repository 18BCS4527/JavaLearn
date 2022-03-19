package learn;

// final keyword examlpe for class

final class TestFinal{
	String name;
	TestFinal(){
		name="Dinesh Reddy";
		System.out.println(name);
	}
	
	
}

//inheriting final class and it's compile time error

//class TestFinal2 extends TestFinal{
//	
//}

public class finalexml {
	
	public static void main(String[] args) {
		final int a=10;
		System.out.println("Final variable display: "+a);
		//Reinailazing the final varibal and it's compail time error
//		a=20;
	}

}


// we can't reinailze variable or we can't inherite the final class 

