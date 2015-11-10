package boekhandel;

import java.util.ArrayList;

public class Book extends Readable {
	private ArrayList<Book> books = new ArrayList<Book>();
	public Book(String title, double price) {
		super(title, price);
		
		//add book from constructor to array 
	}

}
