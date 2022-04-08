package prototype;

public class Book {
	
	private String name;
	private String autor;
	private int price;
	
	public Book(String name, String autor, int price) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\n\tBook [name=" + name + ", autor=" + autor + ", price=" + price + "]";
	}
	
	
	

}
