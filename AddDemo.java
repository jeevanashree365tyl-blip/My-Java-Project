
package citnc;
import java.util.ArrayList;

public class AddDemo 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Asha");
		names.add("Rahul");
		names.add(1,"Meera");
		
		System.out.println(names);
	}

}
