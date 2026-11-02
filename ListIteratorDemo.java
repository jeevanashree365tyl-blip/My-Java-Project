package citnc;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Arun");
		names.add("Akshay");
		
		ListIterator<String> it = names.listIterator();
		while(it.hasNext())
		{
			String name = it.next();
			it.set (name.toUpperCase());
		}
		System.out.println(names);
    }
}
