import java.util.Scanner;
class Test06
{
	Test06() //defaault consturctor
	{
		System.out.println("Hello World");
	}
	Test06(int a, int b)//parametrized
	{	
		System.out.println("sum is :" +(a+b));
	}
	Test06(int x, int y , int z)
	{
		System.out.println("sum is :" +(x*y*z));
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test06 t1 = new Test06();
     Test06 t2 = new Test06(12,45);
     Test06 t3 = new Test06(12,10,5);
	}

}
