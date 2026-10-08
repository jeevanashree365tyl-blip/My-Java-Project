package citnc;
import java.util.Scanner;
public class Scan 
{
	Scanner scanner = new Scanner(System.in);
	String name;
	int age;
	void add()
	{
		System.out.println("Hello");
	}
	Scan()
	{
		System.out.println("World");
	}
	
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter the name:");
    	String name = scanner.nextLine();
    	System.out.print("Enter your Age:");
        int age = scanner.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    	Scan tt = new Scan();
    	tt.add();
    
    }
    
	

}
