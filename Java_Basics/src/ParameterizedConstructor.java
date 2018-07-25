class Person
{
	String name;
	String book;
	int no_of_books;
	Person( String s, String b1, int count)
	{
		name = s;
		book = b1;
		no_of_books= count;
	}
	void details()
	{
		System.out.println("Name of the author is : " +name);
		System.out.println("Name of the book is : " +book);
		System.out.println("No of books is : " +no_of_books);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Swami Vivekananda", "The Mind and Its Control", 100);
        p1.details();
	}

}
