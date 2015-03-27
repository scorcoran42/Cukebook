package implementation;

public class Account {
	private int balance = 0;
	
	public Account (String acctType, int initialAmount) {
		balance = initialAmount;
	}
	
	public int getBalance() {
		return balance;
	}
	public int requestCash(int requestAmount){
		
		if (requestAmount <= balance) {
			return requestAmount;
		} else {
			return 0;
		}
	}

}
