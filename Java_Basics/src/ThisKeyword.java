class Student
{
	int rollno;
	double fees;
	String name;
	Student(int rollno, double fees, String name)
	{
		this.rollno= rollno;
		this.fees = fees;
		this.name = name;
	}
	void display()
	{
		System.out.println(rollno+ " " +fees+ " " +name);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(40162, 52000, "Taisen");
		Student s2 = new Student(40172, 72000, "Lucky");
		Student s3 = new Student(40155, 52000, "Honey");
		s1.display();
		s2.display();
		s3.display();
	}

}
