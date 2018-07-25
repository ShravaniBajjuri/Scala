
 class Addition {
void add(int a, int b)
{
	System.out.println("sum of two numbers is :" +(a+b));
	
}
void add(int a, int b, int c)
{
	System.out.println("sum of three numbers is :"+(a+b+c));
}
}
public class Overloading
{
	public static void main(String args[])
	{
		Addition a1 = new Addition();
		a1.add(15, 26);
		a1.add(10, 1,24);;
	}
}
