package decorator;

public abstract class DecoratorPizza extends APizza {
	
	// OBIECT CONCRET
	protected APizza aPizza;
	
	public DecoratorPizza(APizza p) {
		this.aPizza = p;
	}

	@Override
	public void getIngredients() {
		
		aPizza.getIngredients();
		
		
	}

	@Override
	public void calculateCost() {
		
		aPizza.calculateCost();
	}
	
	
	
	

}
