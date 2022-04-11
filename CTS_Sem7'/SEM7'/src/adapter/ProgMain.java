package adapter;

public class ProgMain {

	public static void main(String[] args) {
		
		IPen penFav = new PenAdapter();
		
		Student s = new Student();
		s.getPen(penFav);
		s.write();

	}

}
