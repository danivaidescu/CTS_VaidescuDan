package adapter;

public class ProgMain {

	public static void main(String[] args) {
		
		int []v = new int[2];
		v[0] = 100;
		v[1] = 150;
		
		Client cl = new Client("Daniel", 2, v);
		IDiscountB discount = new AdapterB2A();
		
		discount.calculateDiscountB(cl);
		
		

	}

}
