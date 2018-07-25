import java.util.*;
import java.util.Arrays;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , n1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n, n1:" );
		n= sc.nextInt();
		n1=sc.nextInt();
		
try
{
	double res = n/n1;
	System.out.println("res" +res);
	int array[]= {1,10};
	array[3]=6;
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e1)
{
	System.out.println(e1);
}
	}

}
