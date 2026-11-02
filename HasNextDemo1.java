package citnc;
import java.util.ArrayList;
import java.util.Iterator;

public class HasNextDemo1 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Arun");
		names.add("Akshay");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
