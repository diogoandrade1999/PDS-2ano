package P8b;

public class BankProxy implements BankAccount{
	
	private BankAccountImpl bankAccount;

	public BankProxy(String bank, double initialDeposit) {
		this.bankAccount = new  BankAccountImpl(bank, initialDeposit);
	}
	
	@Override
	public void deposit(double amount) {
		bankAccount.deposit(amount);
	}

	@Override
	public boolean withdraw(double amount) {
		if(Company.user == User.OWNER)
			return bankAccount.withdraw(amount);
		throw new UnsupportedOperationException("Cannot perform this operation!");
	}

	@Override
	public double balance() {
		if(Company.user == User.OWNER)
			return bankAccount.balance();
		throw new UnsupportedOperationException("Cannot perform this operation!");
	}
	

}
