import java.util.Scanner;

class Voting
{
	int age;
	void eligibility()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the citizen");
		age = sc.nextInt();
		if(age>18)
		{
			System.out.println("The person is eligible to vote");
		}
		else
		{
			System.out.println("The person is not eligible to vote");
		}
	}
}
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting v1 = new Voting();
		v1.eligibility();

	}

}
