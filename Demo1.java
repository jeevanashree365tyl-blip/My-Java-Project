package citnc;
//Assigning values
public class Demo1 
{
	int a;
	int b;
	void m1(int c,int d)
	{
		a=c;
		b=d;
	}
	void m2()
	{
		System.out.println("Sum:"+(a+b));
	}
	
	public static void main(String[] args)
	{
		Demo1 tt = new Demo1();
		tt.m1(4, 6);
		tt.m2();
	}
}


