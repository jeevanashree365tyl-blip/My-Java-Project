package citnc;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplications 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Ashwini");
		names.add("Charan");
		names.add("Ashwini");
		
		HashSet<String> unique = new HashSet<>(names);
		System.out.println(unique.size());
		
	}

}
