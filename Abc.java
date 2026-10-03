package citnc;

abstract class Abcd
{
	abstract void withdraw();
	abstract void deposit();
}
class Abc extends Abcd 
{
	void withdraw()
	{
		System.out.println("Debited");
	}
	void deposit()
	{
		System.out.println("Credited");
	}
	public static void main(String[] args)
	{
		Abc tt = new Abc();
		tt.withdraw();
		tt.deposit();
	}
}
