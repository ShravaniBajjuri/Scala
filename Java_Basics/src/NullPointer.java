import java.util.*;
public class NullPointer {
static void getLength(String text)
{
		try
		{
			System.out.println("Length of the input value is :" +text.length());
		}
		catch(Exception e)
		{
			System.out.println("Exception while trying to find the length of the string:" +e.toString());
		}

}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to find length: ");
		String text = sc.next();
		if(text.length()==0)
		{
			text=null;
		}
		getLength(text);
	}

}
