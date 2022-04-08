package prototype;

public class ProgMain {

	public static void main(String[] args) {
		
		Bookstore carturesti = Bookstore.loadDataFromDB("carturesti");
		System.out.println(carturesti);
		
		Bookstore diverta = carturesti;
		diverta.getListBooks().remove(2);
		
		System.out.println("SHALLOW COPY");
		System.out.println(carturesti);
		
		

	}

}
