package citnc;

public class BankAccount 
{
	String accountNumber;
	String holderName;
	double balance;
	//Constructor
	BankAccount(String accNo, String name, double bal)
	{
		accountNumber = accNo;
		holderName = name;
		balance = bal;
	}
	//Method
	void deposit(double amount)
	{
		balance = balance+amount;
	}
	void withdraw(double amount)
	{
		balance = balance-amount;
	}
	void display()
	{
		System.out.println("\n---BANK HOLDER DETAILS---\n");
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Name:"+holderName);
		System.out.println("BAlance:"+balance);
		
	}
    public static void main(String[] args)
    {
    	BankAccount acc1 = new BankAccount("101","Rahul",5000);
    	BankAccount acc2 = new BankAccount("102","Priya",8500);
    	BankAccount acc3 = new BankAccount("103","Amit",12000);
    	acc1.deposit(2000);
    	acc2.withdraw(1000);
    	acc3.deposit(3000);
    	acc1.display();
    	acc2.display();
    	acc3.display();
    }
}
