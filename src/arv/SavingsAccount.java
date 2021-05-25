package arv;

public class SavingsAccount extends AbstractAccount {
	
	private final static int MAX_WITHDRAWALS = 12;
	private final static double FEE = 100;
	
	private int withdrawals = 0;

	public SavingsAccount() {
		super(0.04);
	}
	
	@Override
	public double withdraw(double amount) {
		if (withdrawals++ >= MAX_WITHDRAWALS) {
			amount += FEE;
		}
		return super.withdraw(amount);
	}
	
	@Override
	public double nextYear() {
		withdrawals = 0;
		return super.nextYear();
	}
	
}
