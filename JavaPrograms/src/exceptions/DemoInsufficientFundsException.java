package exceptions;

public class DemoInsufficientFundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccount ca = new CheckingAccount(101);
		System.out.println("Depositing $500.00");
		ca.depositMoney(500.00);
		
		try {
			System.out.println("Withdrawing $400.00");
			ca.withdrawMoney(400.00);
			
			System.out.println("Withdrawing $250.00");
			ca.withdrawMoney(250.00);
		}
		catch(InsufficientFundsException e) {
			System.out.println("Sorry, you are short of $" + e.getAmount());
			e.printStackTrace();
		}
	}
}