package simpleBankingSystem;

public abstract class BankAccount {

	protected double balance;
	protected String accountHolderName;
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited successfully : " + amount);
		}else {
			System.out.println("Invalid deposit : "+amount);
		}
	}
	
	public abstract void withdraw(double amount);
		public double getBalance() {
			return balance;
		}
		
		public void displayBalance() {
			System.out.println(accountHolderName+"Account balance "+ balance);
		}
}
	

