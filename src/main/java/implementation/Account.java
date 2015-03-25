package implementation;

public class Account {
	public int balance = 0;
	public Account (String acctType, int initialAmount) {
		balance = initialAmount;
	}
	
	public int getBalance() {
		return balance;
	}
	public int requestCash(int requestAmount){
		
		if (requestAmount <= balance) {
			System.out.println("if");
			return requestAmount;
		} else {
			System.out.println("else");
			return 0;
		}
	}

}
