class Calculate
{
	int num1, num2;
	Calculate(int n1 , int n2)// as the method doesnot  accept any values we are defining constructor
	{
		num1 = n1;
		num2 = n2;
	}
	double add() //does not accept any values but return the result
	{
		double result1 = num1+num2;
		System.out.println("summation is :" +result1 );
		return result1;
	}
}
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Calculate c1 = new Calculate(12,34);
   c1.add();
 
	}

}
