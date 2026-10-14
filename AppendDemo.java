package citnc;

public class AppendDemo 
{
	public static void main(String[] args)
	{
		//Append : adding the string.
		StringBuilder ab = new StringBuilder("Charan");
	    ab.append("tej");
	    ab.append(" 016");
	    System.out.println(ab);
	    //Inserting : inserting in b/w
	    StringBuilder tt = new StringBuilder("Abcdij");
		tt.insert(3,"efgh");
		System.out.println(tt);
		//Delete : deleting the string.
		StringBuilder bb = new StringBuilder("jeevana");
		bb.delete(2,6);
		System.out.println(bb);
		//Reverse : here reversing the string
		StringBuilder s = new StringBuilder("jeevana");
		s.reverse();
		System.out.println(s);
	}

}
