package citnc;


public class Overloading{
	void add(String s)
	{
		System.out.println("1st");
	}
	void add(int a, int b)
	{
		System.out.println("2nd");
	}
	public static void main (String[]args) {
	Overloading tt=new Overloading();
	tt.add(2,3);
	tt.add("vdhvcghdc");
	}
}


