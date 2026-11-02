package citnc;
import java.util.LinkedList;

public class AccessDemo 
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list.getFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}
