package citnc;

class Abcde
{
	private String name;
	
	public String getA()
	{
		return name;
	}
	public void setA(String name)
	{
		this.name = name ;
	}
}
public class Encapsul extends Abcde 
{
	public static void main(String[] args)
	{
		Encapsul tt = new Encapsul();
		tt.setA("Jeevana");
		String bb = tt.getA();
		System.out.println("Name:" +bb);
	}

}



