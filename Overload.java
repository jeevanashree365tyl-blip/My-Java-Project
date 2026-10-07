package citnc;

public class Overload 
{
	Overload()
	{
		System.out.println("hello");
	}
	Overload(int a,int b)
	{
		System.out.println("4th");
	}
	Overload(String s)
	{
		System.out.println("jeevana");
	}
	public static void main(String[] args)
	{
		Overload tt = new Overload();
		Overload aa = new Overload(6,8);
		Overload rr = new Overload("answer");
	}
}