package citnc;

public class Helllo 
{
	public static void main(String... args)
	{
	//ArrayIndexOutOfBounds Exception many catches 
	 System.out.println("starting the Arraybound");
	 try
	 {
	    int a =10/0;
	   	int[]b = {10,20,30};
	   	System.out.println(b[0]);
	   	System.out.println(b[1]);
	   	System.out.println(b[2]);
    	System.out.println(b[3]);
    }catch(ArithmeticException e)
    {
    	System.out.println("Arithmetic block"+e);
	}
	catch(ArrayIndexOutOfBoundsException e)
    {
		System.out.println("Array Index Block"+e);
	}
	catch(Exception e)
	 {
		System.out.println("Array Index Block"+e);
	 }
	 System.out.println("End");
	}
}