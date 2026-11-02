package citnc;
import java.util.ArrayList;

public class IterateDemo 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Jeevana");
		names.add("Charan");
		
		for(String name : names) 
		{
			System.out.println(name);
		}
	 }
}
