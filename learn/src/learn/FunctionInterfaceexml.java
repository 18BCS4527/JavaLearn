package learn;

import java.util.Scanner;
import java.util.function.Function;

class Fruits{
	String name;
	int amount;
	public Fruits(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	
	
}

public class FunctionInterfaceexml {

	public static void main(String[] args) {
		Function<Fruits,String>f1= fruit->{
			String ans;
			if(fruit.amount>90) {
				ans=fruit.name+" price is High";
			}
			if(fruit.amount>90) {
				ans=fruit.name+" price is Little High";
			}
			else {
				ans=fruit.name+" price is best to buy";
			}
			return ans;
			
		};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the fruitname: ");
		String name=s.next();
		System.out.println("Enter the price the fruit: ");
		int amout=s.nextInt();
		Fruits f=new Fruits(name,amout);
		System.out.println(f1.apply(f));
	}
}
