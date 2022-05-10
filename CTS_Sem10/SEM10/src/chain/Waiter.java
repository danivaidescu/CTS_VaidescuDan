package chain;

public class Waiter extends AHandler {

	@Override
	public void processOrder(Order o) {
		
		if (o.getDifficulty() > 5) {
			System.out.println("TRhe waiter cannot handle this!");
			this.successor.processOrder(o);
			
		} else {
			System.out.println("The waiter is handling this: " + o.getName());
		}
		
	}

}
