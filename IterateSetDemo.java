package citnc;
import java.util.HashSet;
//Iterating a HashSet
public class IterateSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<String> tags = new HashSet<>();
		tags.add("Java");
		tags.add("Collections");
		tags.add("Exceptions");
		
		for(String tag : tags)
		{
			System.out.println(tag);
		}
	}

}
