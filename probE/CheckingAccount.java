package lab4.probE;

public class CheckingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingAccount(String accId, double fee, double startBalance) {
		this.accId = accId;
		this.balance = startBalance;
		this.monthlyFee = fee;
	}


	public CheckingAccount(String accId2, double fee, int startBalance) {
		this.accId = accId2;
		this.balance = startBalance;
		this.monthlyFee = fee;
	}


	@Override
	String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	double computeUpdatedBalance() {
		return balance- monthlyFee;
	}
}
