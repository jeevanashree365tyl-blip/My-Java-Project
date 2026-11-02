package citnc;
//Exception example
public class Except 
{
	public static void main(String[] args)
	{
		System.out.println("Startt");
		try
		{
			int a =10/0;
		}catch(Exception e)
		{
			System.out.println("abcdefghij");
		}
		System.out.println("sdfghjklked");
		System.out.println("\n");
        //Arithmetic Exception
        System.out.println("starting the Arithmetic exception");
        try
        {
        	int a =10/0;
        	int[]b = {10,20,30};
        	System.out.println(b[0]);
        	System.out.println(b[1]);
        	System.out.println(b[2]);
        	System.out.println(b[3]);
        }catch(Exception e)
        {
        	System.out.println("catch block"+e);
        }
        System.out.println("End");
	}
}