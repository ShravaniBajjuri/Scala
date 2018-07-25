
public class Arithematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
 {
	 int n = args.length;
	 System.out.println("n :" +n);
	 int a = 45/n;
	 System.out.println("a: "+a);
 }
 catch(ArithmeticException a1)
 {
	 System.out.println(a1);
	 
 }
 finally
 {
	 System.out.println("closing files");
 }
	}

}
