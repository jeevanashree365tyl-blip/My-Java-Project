package citnc;

public class Stringcomparision 
{
	public static void main(String[] args)
	{
		//== Comparing strings checks references means both variables point to exact same memory locations or not.
		//It is done without new keyword.
		String a = "charan";
		String b = "charan";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//.equals() checks contents in both strings and it is done with new keyword.
		String c = new String("charan");
		String d = new String("charan");
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
	}

}
