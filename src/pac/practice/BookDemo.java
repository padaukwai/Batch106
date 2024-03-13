package pac.practice;

import java.util.ArrayList;

public class BookDemo {

	/*
	 * int book_id; String book_name; String b_authname; String b_type;
	 */
	static ArrayList<Book>booklist=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Java1","Auth1","java");
		Book b2=new Book(2,"Java2","Auth2","java");
		Book b3=new Book(3,"Java3","Auth3","java");
		Book b4=new Book(4,"Java4","Auth4","java");
		
		booklist.add(b1);
		booklist.add(b2);
		booklist.add(b3);
		booklist.add(b4);
		
		for(int i=0;i<booklist.size();i++)
		{
			System.out.println(booklist.get(i));
		}
	}

}
