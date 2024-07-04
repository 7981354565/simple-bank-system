package simpleBankingSystem;

public class CheckingAccount extends BankAccount {

	private double overDraftLimit;
	
	public CheckingAccount(String accountHolderName , double initialBalance, double overDraftLimit) {
		super(accountHolderName,initialBalance);
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0 && amount<=(balance+overDraftLimit)) {
			balance -= amount;
			System.out.println("withdrawn successfull : "+amount);
		}else {
			System.out.println("Withdraw exceeds the overdraft limit");
		}
	}

}
