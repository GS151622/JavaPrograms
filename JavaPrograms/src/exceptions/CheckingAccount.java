package exceptions;

public class CheckingAccount {
	private int accountNumber;
	private double accountBalance;
	
	public CheckingAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void depositMoney(double amount) {
		accountBalance+= amount;
	}
	
	public void withdrawMoney(double amount) throws InsufficientFundsException{
		if(accountBalance - amount > 0) {
			accountBalance -= amount;
		}
		else {
			double needMore = amount - accountBalance;
			throw new InsufficientFundsException(needMore);
		}	
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
}