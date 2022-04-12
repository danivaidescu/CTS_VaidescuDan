package decorator;

public class DecoratorChicken extends DecoratorPizza {

	
	public DecoratorChicken(APizza pizza) {
		super(pizza);
		
	}
	@Override
	public void getIngredients() {
		
		super.getIngredients();
		
		System.out.println("+ chicken");
	}

	@Override
	public void calculateCost() {
		
		super.calculateCost();
		System.out.println("+ 10 RON (chicken)");
	}
	
	

}
