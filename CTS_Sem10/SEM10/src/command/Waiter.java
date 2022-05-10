package command;
import java.util.ArrayList;

public class Waiter {
	
	private ArrayList<IOrder>orderList = new ArrayList<IOrder>();
	
	public void noteOrder(IOrder command) {
		this.orderList.add(command);
	}
	
	public void sendOrders() {
		
		for(IOrder order: orderList) {
			order.processOrder();
		}
		
		orderList.clear();
		
	}

}
