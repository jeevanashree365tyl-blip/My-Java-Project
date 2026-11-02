package citnc;
import java.util.ArrayList;
import java.util.Iterator;

public class ToDoList 
{
	public static void main(String[] args)
	{
		ArrayList<String> tasks = new ArrayList<>();
		tasks.add("Write report");
		tasks.add("Review report");
		tasks.add("Reply to email");
		
		tasks.remove("Reply to email");
		
		for(String task : tasks)
		{
			System.out.println(" "+ task);
		}
	}
}
