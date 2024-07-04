package simpleBankingSystem;

public class MainClass {
 
	public static void main (String[] args) {
		SavingAccount savingAccount = new SavingAccount("Sai kiran", 1000.0, 8.0);
		CheckingAccount checkingAccount = new CheckingAccount("varsha", 1000.0, 1000.0);
		System.out.println("Saving account operatons : ");
		savingAccount.displayBalance();
		savingAccount.deposit(-600.0);
		savingAccount.displayBalance();
		savingAccount.withdraw(50.0);
		savingAccount.displayBalance();
		savingAccount.addIntrest();
		savingAccount.displayBalance();
		
		System.out.println("Checking account operations : ");
		checkingAccount.displayBalance();
		checkingAccount.deposit(100.0);
		checkingAccount.displayBalance();
		checkingAccount.withdraw(-1200.0);
		checkingAccount.displayBalance();
		checkingAccount.withdraw(20.0);
		checkingAccount.displayBalance();
		
	}
	
}
