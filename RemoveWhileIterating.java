package citnc;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveWhileIterating 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext())
		{
			if(it.next() % 2 == 0) 
			{
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
