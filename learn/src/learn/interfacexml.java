package learn;

interface Banks{
	public double intrestCal(int amout);
}



public class interfacexml {
	
	public static void main(String[] args) {
		
		Banks b=(a)->0.7*a+a;
		System.out.println("Amount with interst is:"+b.intrestCal(4500));
		
	}

}
