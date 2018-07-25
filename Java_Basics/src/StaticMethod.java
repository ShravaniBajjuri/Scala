class Area
{
	static double multiplier(double l,double b)
	{
		double area = l*b;
		return area;
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double s1 = Area.multiplier(15.5,10.2);
     System.out.println("Area is :" +s1);
	}

}
