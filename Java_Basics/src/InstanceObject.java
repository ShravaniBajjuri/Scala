class Netflix
{
	String showname1;
	int no_of_seasons;
	void shows()
	{
		
		System.out.println( "Name of the show is:" +showname1);
		System.out.println("No of seasons for the show are:" +no_of_seasons);
	}
}
public class InstanceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Netflix n1 = new Netflix();
    n1.showname1="Riverdale";
    n1.no_of_seasons= 2;
    n1.shows();
	}

}
