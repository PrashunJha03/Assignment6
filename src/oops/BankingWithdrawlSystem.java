package overloading;

abstract class BankAccount
{
	int accountNumber;
	String customerName;
	double balance;
	
	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Amount Deposited : "+amount);
	}
	
	void displayAccountDetails()
	{
		System.out.println("Account Number   : " + accountNumber);
		System.out.println("Customer Name    : " + customerName);
		System.out.println("Balance          : "+balance);
	}
	
	abstract void calculateWithdrawalLimit();
}


class SavingsAccount extends BankAccount
{
	@Override
	void calculateWithdrawalLimit()
	{
		double limit = balance * 50/100 ;
		System.out.println("Withdrawal Limit : " + limit);
	}
}

class CurrentAccount extends BankAccount
{
	double overdraftFacility = 5000;
	
	@Override
	void calculateWithdrawalLimit()
	{
		double limit = balance + overdraftFacility;
		System.out.println("Withdrawal Limit : "+ limit);
	}
}



public class BankingWithdrawlSystem {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.accountNumber = 1001;
		s.customerName = "Prashun";
		s.balance = 50000;
		
		System.out.println("------------Savings Account Details-------------");
		
		s.displayAccountDetails();
		s.deposit(10000);
		s.calculateWithdrawalLimit();
		
		CurrentAccount c = new CurrentAccount();
		c.accountNumber = 101;
		c.customerName = "Prashun Jha";
		c.balance = 100000;
		
		System.out.println("\n------------Current Account Details-------------");
		
		c.displayAccountDetails();
		c.deposit(5000);
		c.calculateWithdrawalLimit();
	}

}
