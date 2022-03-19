package learn;


class One{
	public void add(int a,int b) {
		System.out.println("Class one Addition: "+(a+b));
	}
}

class Two extends One{
	public void add(int a, int b) {
		System.out.println("Class Two Addition: "+(a+b));
	}
}
public class FunctionOverriding {
	
	public static void main(String[] args) {
		One o=new One();
		One t=new Two();
		o.add(15, 16);
		t.add(10, 30); 
	}

}
