package prototype.resolved;

public class ProgMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Bookstore carturesti = Bookstore.loadDataFromDB("carturesti");
		System.out.println(carturesti);
		
		Bookstore diverta = (Bookstore) carturesti.clone();
		diverta.getListBooks().remove(2);
		
		System.out.println("--DEEP COPY--");
		System.out.println(carturesti);
		
		

	}

}
