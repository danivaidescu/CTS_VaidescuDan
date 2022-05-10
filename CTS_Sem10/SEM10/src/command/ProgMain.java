package command;

public class ProgMain {

	public static void main(String[] args) {
		
		Chef c1 = new Chef("Catalin Scarlatescu");
		Chef c2 = new Chef("Sorin Bontea");
		
		Waiter waiter = new Waiter();
		
		waiter.noteOrder(new PizzaOrder(c1, "Diavola"));
		waiter.noteOrder(new PastaOrder(c2, "Carbonara"));
		waiter.noteOrder(new PizzaOrder(c1, "Margherita"));
		
		waiter.sendOrders();

	}

}
