
import java.util.*;
public class MultipleExceptions {
public static void main(String args[])
{
	int a, b ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Two integers are ");
	a= sc.nextInt();
	b = sc.nextInt();
   try
   {
	    int result = a/b;
	   System.out.println("Result of divisionis :" +result);
   }
   catch(ArithmeticException ae)
   {
	   System.out.println(ae);
   }
   finally
   {
	   System.out.println("End of the program");
   }
}
}
