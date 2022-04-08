package prototype.resolved;

import java.util.ArrayList;

public class Bookstore implements Cloneable {
	
	private String name;
	private ArrayList<Book>listBooks = new ArrayList<Book>();
	
	
	
	public Bookstore() {
		
	}

	public Bookstore(String name, ArrayList<Book> listBooks) {
		super();
		this.name = name;
		this.listBooks = listBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getListBooks() {
		return listBooks;
	}

	public void setListBooks(ArrayList<Book> listBooks) {
		this.listBooks = listBooks;
	}

	@Override
	public String toString() {
		return "\n\tBookstore [name=" + name + ", listBooks=" + listBooks + "]";
	}
	
	public static Bookstore loadDataFromDB(String name) {
		Bookstore b = new Bookstore();
		b.setName(name);
		
		Book book;
		for(int i = 0; i < 10; i++) {
			book = new Book(name + " -" + i, "Daniel", i * 100);
			b.listBooks.add(book);
			book = null;
			
		}	
		return b;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Bookstore bClone = new Bookstore();
		bClone.name = this.name;
		bClone.listBooks = (ArrayList<Book>) this.listBooks.clone(); // DOAR PENTRU ARRAY LIST
		return bClone;
	}
	
	
	

}
