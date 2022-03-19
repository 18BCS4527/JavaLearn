package learn;

public class poly {
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Int sum Answer: "+c);
	}
	
	public void add(float a,float b) {
		float c=a+b;
		System.out.println("Float sum Answer: "+c);
	}
	
	public void add(String a,String b) {
		String c=a+b;
		System.out.println("String add Answer: "+c);
	}
	
	public static void main(String[] args) {
		poly p=new poly();
		p.add(2, 4);
		p.add(2.5F, 4.5F);
		p.add("Dinesh ", "Reddy");
		
	}

}
