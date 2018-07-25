import java.text.NumberFormat;
import java.util.Scanner;

public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r ;
		double pi = (double)22/7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the radius:");
		r = sc.nextDouble();
        double area= pi*r*r;
        System.out.println("Area is :" +area);
        NumberFormat nf1 = NumberFormat.getNumberInstance();
        //store format info into obj
        nf1.setMaximumFractionDigits(8);
        nf1.setMinimumIntegerDigits(5);
        //apply format to area
        String str = nf1.format(area);
        System.out.println("Formatted area:" + str);
        
	}

}
