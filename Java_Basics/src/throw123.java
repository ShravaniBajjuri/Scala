import java.util.*;
public class throw123 {
	static int add( int a, int b)
	{
		if(a>1000)
		{
			throw new ArithmeticException("a is greater than 1000 and hence exception is thrown");
		}
		else
		{
			System.out.println("a is less than 1000");
		}
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		int result= add(a,b);
		System.out.println("Result is :"+result);

	}

}
