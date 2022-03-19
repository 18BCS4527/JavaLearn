package learn;

public class UserDefinedException extends RuntimeException {

	public UserDefinedException() {
		super("Invalid Funds avaible in your account");
	}
	
}



class TestBalance{
	
	public void check(int balance,int withdraw) {
		if(balance>5000&&balance>withdraw) {
			System.out.println("Transaction Successful...");
		}
		else {
			throw new UserDefinedException();
		}
	}
}


