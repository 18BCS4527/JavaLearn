package learn;


class A{
	String a;
	A(){
		a="Dinesh Reddy";
		System.out.println("Class A constructor");
	}
}

class B extends A{
	
	B(){
		super();
	}
	void show() {
		System.out.println("Know the name "+super.a);
	}
}
public class superexml{
	
	public static void main(String[] args) {
		B b=new B();
		b.show();
	}

}
