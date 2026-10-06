package citnc;

class Parent
{
	private int a;
	
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}
}
public class Encaps extends Parent 
{
	public static void main(String[] args)
	{
		Encaps tt = new Encaps();
		tt.setA(3);
		int bb = tt.getA();
		System.out.println("Value of a:" +bb);
	}

}
