package learn;
import java.util.*;
import java.util.function.Predicate;

class Account{
	int id1;
	int id2;
	public Account(int id1, int id2) {
		super();
		this.id1 = id1;
		this.id2 = id2;
	}
	
	
}
public class Predicateexml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Account>k= account->account.id1==account.id2;
		
		Scanner s=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter Account Number:");
		n1=s.nextInt();
		System.out.println("Reenter the Account Number:");
		n2=s.nextInt();
		Account a=new Account(n1,n2);
		
		if(k.test(a)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}

	}

}
