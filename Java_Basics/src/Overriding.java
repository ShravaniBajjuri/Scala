class Sample
{
	void factorial(int a)
	{
		int fact =1;
		for(int i=1;i<=a;i++)
	     fact = fact*i;
		System.out.println("Factorial of number is :" +fact);
	}
}
class Sample2 extends Sample{
	void factorial(int a)
	{
		System.out.println("Value of a is :" +a);
	}
}
public class Overriding {
	public static void main (String args[])
	{
		Sample s1 = new Sample();
		s1.factorial(6);
	}

}
