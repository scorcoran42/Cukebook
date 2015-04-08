package nicebank;


public class Teller {
	private CashSlot cashSlot;

	public Teller(CashSlot cashSlot) {
		this.cashSlot = cashSlot;
	}

	public void withdrawFrom(Account account, int dollars) {

		if (dollars <= account.getBalance().dollars()) {
			cashSlot.dispense(dollars);
			account.debit(dollars);
		}else{
			cashSlot.dispense(0);
		}
	}
}

