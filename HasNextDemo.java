package citnc;
import java.util.ArrayList;
import java.util.Iterator;

public class HasNextDemo 
{
	public static void main(String[] args)
		{
			ArrayList<String> names = new ArrayList<>();
			names.add("Jeevana");
			names.add("Charan");
			
			Iterator<String> it = names.iterator();
			while (it.hasNext())			
			{
				System.out.println(it.next());
			}
		}
}
	//Iterator is a best method to execute the class without using a simple for loop for execution of the code.
//iterator is an interphase, when collection classes are used iterator and list iterator is a best option
//iterator have a method support but for loop doesn't have and for loop should have a logic
