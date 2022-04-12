package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA {

	@Override
	public double calculateDiscountA(int value) {
		
		System.out.println("DISCOUNT METHOD A2");
		// NU POATE SA FIE ADAPTATA
		return 0;
	}

	
	

}
