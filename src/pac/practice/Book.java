package pac.practice;

public class Book {
	int book_id;
	String book_name;
	String b_authname;
	String b_type;
	Book(int bid,String bname,String authorname,String btype)
	{
		book_id=bid;
		book_name=bname;
		b_authname=authorname;
		b_type=btype;
		
	}
	public String toString()
	{
		return book_name+" "+b_type;
	}
}
