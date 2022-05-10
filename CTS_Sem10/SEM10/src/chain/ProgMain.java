package chain;

public class ProgMain {

	public static void main(String[] args) {
		
		Order o1 = new Order("Pizza", 15);
		Order o2 = new Order("Coffe", 3);
		
		AHandler waiter = new Waiter();
		AHandler chef = new Chef();
		
		waiter.setSuccesor(chef);
		
		waiter.processOrder(o1);
		waiter.processOrder(o2);
		

	}

}
