package citnc;

public class SplitDemo 
{
	public static void main(String[] args)
	{
		String s1 = "apple, mango, orange";
		String[] fruits = s1.split(" ");
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		//replacing the string with another string
		String s2 = new String("Jeevana is writing");
		String s3 = s2.replace("is","Charan");
		System.out.println(s3);
	}

}
