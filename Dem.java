package citnc;
//
interface Abce
{
	void m1();
}

public class Dem implements Abce
{
	public void m1()
	{
		System.out.println("Hello World!");
	}
	public static void main(String[] args)
	{
		Dem tt = new Dem();
		tt.m1();
	}

}