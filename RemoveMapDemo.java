package citnc;
import java.util.HashMap;

public class RemoveMapDemo 
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("Harshi", 90);
		scores.put("Deekshu", 96);
		
		scores.remove("Deekshu");
		System.out.println(scores);
	}

}
