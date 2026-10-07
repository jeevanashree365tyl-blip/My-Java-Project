package citnc;
import java.util.Scanner; 
public class Atm 
{
	 public static void main(String[] args) 
	 {
		 Atm tt = new Atm();
	     // 2. Create a Scanner object to read console input
		 Scanner scanner = new Scanner(System.in);
		 String name="";
		 String designation="";
		 int age=0;
		 double salP = 25000,salT =20000,salM = 30000;
		 int choice;
		 do
		 {
			 System.out.println("\n----ATM Menu Options----");
			 System.out.println("1.Create");
			 System.out.println("2.Display");
			 System.out.println("3.Raise salary");
			 System.out.println("4.Exit");
			 System.out.print("Enter your choice:");
			 
	         
			 // 3. Read the integer input from the user
			 choice = scanner.nextInt();
			 scanner.nextLine();
	        
			 // 4. Pass the variable into the switch statement
			 switch (choice) 
			 {
			 case 1:
				String answer;
				do
				{
	            System.out.print("Enter your Name:");
	            name = scanner.nextLine();
	            
	            System.out.print("Enter your Age:");
	            age = scanner.nextInt();
	            scanner.nextLine();
	            
	            System.out.println("Enter your designation:");
	            designation = scanner.nextLine();
	            
	            System.out.print("Do you want to continue?(Yes/No):");
	            answer = scanner.nextLine();
	           
				}while(answer.equalsIgnoreCase("Yes"));
	            break;
			 case 2:
				 System.out.println("----Details are displayed------");
				 System.out.println("Name:"+name);
			     System.out.println("Age:"+age);
			     System.out.println("Designation:"+designation);
			     if(designation.equals("Programmer"))
			     {
			    	 System.out.println("Salary:"+salP);
			     }
			     else if(designation.equals("Tester"))
			     {
			    	 System.out.println("Salary:"+salT);
			     }
			     else if(designation.equals("Manager"))
			     {
			    	 System.out.println("Salary:"+salM);
			     }
			     else
			     {
			    	 System.out.println("Salary:Not available");
			     }
	            break;
			 case 3:
	            System.out.print("Enter salary increase amount:");
	            double increase = scanner.nextDouble();
	            salP = salP + increase;
	            salT = salT + increase;
	            salM = salM + increase;
	            System.out.println("Salary is updated.");
	            if(designation.equals("Programmer"))
	            {
	            	System.out.println(" Updated Salary:"+salP);
	            }
	            else if(designation.equals("Tester"))
			     {
			    	 System.out.println("Updated Salary:"+salT);
			     }
			     else if(designation.equals("Manager"))
			     {
			    	 System.out.println("Updated Salary:"+salM);
			     }
	            
	            break;
	        case 4:
	            System.out.println("Exiting!....");
	            break;
	        default: // Handles any inputs that aren't 1, 2, or 3
	        	System.out.println("Invalid option. Please choose 1, 2, 3 or 4.");
	        	break;
	        }
		 }while(choice != 4);
	        
	     // 5. Close the scanner resource
	      scanner.close(); 
	   
	
	 }
}
