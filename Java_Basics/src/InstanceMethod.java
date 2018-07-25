class Monument
{
	 String monu_name;
	 int est_year;
		public void setName(String monu_name)//using setName() for storing data into the instance variables
		{
			this.monu_name= monu_name;
		}
		public void setYear(int est_year)
		{
			this.est_year=est_year;
		}
		//Accessor methods to read the data
		public String getName()
		{
			return monu_name;
		}
		public int getYear()
		{
			return est_year;
		}
	}
public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monument m1 = new Monument();
		m1.setName("Taj Mahal");
		m1.setYear(1632);
		System.out.println("Name: "+ m1.getName());
		System.out.println("Established  Year: "+ m1.getYear());

	}

}
