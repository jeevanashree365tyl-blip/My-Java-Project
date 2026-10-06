package citnc;
//this method assigning the values from lower scope to higher
public class Demo2 
{
	int a;
	int b;
	void m1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void m2()
	{
		System.out.println("Sum:"+(a+b));
	}
	
	public static void main(String[] args)
	{
		Demo1 tt = new Demo1();
		tt.m1(5,9);
		tt.m2();
	}
}

