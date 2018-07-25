
class Calculate1 
{
	int fact = 1;
	void fact(int n)
	{
		for(int i =1;i<=n; i++)
		{
			fact = fact*i;
			System.out.println(fact);
		}
	}
}
class Calculate2 extends Calculate1
{
	int n = 10, i=2;
	void even()
	{
		if(n%i==0)
		{
			System.out.println(" %i Number is even:");
		}
	}
}
public class WidenRef 
{
public static void main(String args[])
{
	Calculate1 c1; //c1 is super class reference
	 c1 = new Calculate2(); //c1 referring to sub-class object
	 c1.fact(5); //Method of base class is used
}
}
