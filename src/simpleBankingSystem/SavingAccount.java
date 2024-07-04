package simpleBankingSystem;

public class SavingAccount extends BankAccount {

	private double intrestRate;
	public SavingAccount(String accountHolderName , double initialBalance, double intrestRate) {
		super(accountHolderName,initialBalance);
		this.intrestRate = intrestRate;
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdrawn : "+ amount);
		}else {
			System.out.println("insufficient balance for WithDraw");
		}
	}
	
	
	public void addIntrest() {
		double intrest = balance*intrestRate/100;
		balance += intrest;
		System.out.println("Intrest added : "+intrest);
	}
	
	
}
