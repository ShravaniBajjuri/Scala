import java.util.Scanner;
class Employee123
 {
	 String e_name;
	 int e_id, e_mob;
	 void professionalDetails()
	 {

		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee designation:");
		String e_desig = sc.next();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the employee salary:");
		double e_sal = sc1.nextDouble();
		 System.out.println("designation is " +e_desig);
		 System.out.println("Salary of the employee is :" +e_sal);
	 }
 }


public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee123 e1 = new Employee123();
	e1.professionalDetails();
	}

}
