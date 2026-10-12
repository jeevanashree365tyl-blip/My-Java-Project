package citnc;
// calling the method multiple times
public class Hello 
{
	void m1(int... a)
	{
		System.out.println("Hello World!");
	}
	public static void main(String...args)
	{
		Hello tt = new Hello();
		tt.m1();
		tt.m1(1,3);
		tt.m1(1,2,3);
		tt.m1(1,2,3,4);
		tt.m1(1,2,3,4,5,6,7);
	}
}
