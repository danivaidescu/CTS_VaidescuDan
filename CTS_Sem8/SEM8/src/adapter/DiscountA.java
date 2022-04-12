package adapter;

public class DiscountA implements IDiscountA {

	@Override
	public double calculateDiscountA(int value) {
		// value - nr total comenzi
		
		System.out.println("DISCOUNT METHOD A");
		if(value > 100) {
			return 0.1;
		} 
		
		if(value > 50 && value < 100) {
			return 0.05;
		}
		
		return 0;
	}

}
