package citnc;
import java.util.HashSet;

public class Demoo 
{
	public static void main(String[] args)
	{
		HashSet<String> names = new HashSet<>();
		names.add("Jeevana");
		names.add("Charan");
		
		for(String name : names) 
		{
			System.out.println(name);
		}
		
	}

}
