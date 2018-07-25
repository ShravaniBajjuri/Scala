
public class Narrowreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Spark s1;// sub class reference
		s1 = (Spark)new Hadoop();// s1 is refering to super class  object
		s1.sparkCore();
		s1.sparkSql();
	}

}
class Hadoop
{
	void hive()
	{
		System.out.println("structred data, row storage");
	}
	void hBase()
	{
		System.out.println("Unstructured data, columnar storage");
	}
}
class Spark extends Hadoop
{
	void sparkCore()
	{
		System.out.println("RDDs");
	}
	void sparkSql()
	{
		System.out.println("Dataframes");
	}

}
