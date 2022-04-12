package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

	@Override
	public double calculateDiscountB(Client client) {
		
		//return this.calculateDiscountA(client.getNrOrders()); --- v1
		
		// v2
		
		System.out.println("DISCOUNT METHOD B2");
		int total = 0;
		for(int i = 0; i < client.getNrOrders(); i++) {	
			total += client.getOrders()[i];
		}
		
		this.calculateDiscountA(total);
		return 0;
	}
	

}
