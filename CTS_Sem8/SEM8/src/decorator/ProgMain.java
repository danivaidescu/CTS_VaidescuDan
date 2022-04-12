package decorator;

public class ProgMain {

	public static void main(String[] args) {
		
		APizza pizzaBasic = new PizzaBasic();
		
		System.out.println("Pizza basic: ");
		pizzaBasic.getIngredients();
		pizzaBasic.calculateCost();
		
		APizza aPizza = new DecoratorChicken(pizzaBasic);
		
		System.out.println("Pizza chicken: ");
		aPizza.getIngredients();
		aPizza.calculateCost();
		

	}

}
