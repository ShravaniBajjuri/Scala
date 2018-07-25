import java.util.Scanner;

class Test
{
	float i,j;
	Test()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        i = sc.nextFloat();
        j=sc.nextFloat();
        System.out.println("Values of i and j are:" +i +","  +j);
	}
}
public class defaultConsturctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test t1 = new Test();
	}

}
