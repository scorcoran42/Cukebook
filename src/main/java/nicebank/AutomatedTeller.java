package nicebank;


public class AutomatedTeller {
	private CashSlot cashSlot;

	public AutomatedTeller(CashSlot cashSlot) {
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
