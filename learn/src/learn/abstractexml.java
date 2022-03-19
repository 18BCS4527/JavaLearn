package learn;

abstract class Bank{
	abstract void intrest();
}

class HDFC extends Bank{
	void intrest() {
		System.out.println("HDFC Intrest rate is 10.5%");
	}
	
}

class SBI extends Bank{
	void intrest() {
		System.out.println("SBI Intrest rate is 7.5%");
	}
	
}

class ICICI extends Bank{
	void intrest() {
		System.out.println("ICICi Intrest rate is 11.5%");
	}
	
}

public class abstractexml {
	public static void main(String[] args) {
		Bank b;
		b=new HDFC();
		b.intrest();
		b=new SBI();
		b.intrest();
	}

}
