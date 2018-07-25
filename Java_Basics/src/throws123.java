import java.util.*;
import java.io.*;
class Name
{
	
	String name;
void accept() throws IOException
{
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter name");
	name = sc1.next();
			
}
void display()
{
	System.out.println("Name :"+name);
}
	}
	public class throws123 {

		public static void main(String[] args)  throws IOException
		{
			// TODO Auto-generated method stub
			Name s = new Name();
			s.accept();
			s.display();
}
}